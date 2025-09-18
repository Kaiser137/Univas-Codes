package util; 

import utilidades.*;

import javax.swing.*;
import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;

public class ManipuladorArquivos {
    private static final String DIRETORIO = "dados";

    public static void salvarObjeto(String nomeClasse, Object objeto, int camposEsperados) {
        String linhaCSV = "";

        if (objeto instanceof Usuario u) {
            linhaCSV = u.toCSV();
        } else if (objeto instanceof Livro l) {
            linhaCSV = l.toCSV();
        } else if (objeto instanceof Biblioteca b) {
            linhaCSV = b.toCSV();
        } else if (objeto instanceof Secretaria s) {
            linhaCSV = s.toCSV();
        } else if (objeto instanceof Emprestimo e) {
            linhaCSV = e.toCSV();
        }

        salvar(nomeClasse, linhaCSV, camposEsperados);
    }

    public static void atualizarObjeto(String nomeClasse, int id, Object novoObjeto, int camposEsperados) {
        List<String[]> lista = ler(nomeClasse, camposEsperados);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)[0].equals(Integer.toString(id))) {
                String novaLinha = "";

                if (novoObjeto instanceof Usuario u) {
                    novaLinha = u.toCSV();
                } else if (novoObjeto instanceof Livro l) {
                    novaLinha = l.toCSV();
                } else if (novoObjeto instanceof Biblioteca b) {
                    novaLinha = b.toCSV();
                } else if (novoObjeto instanceof Secretaria s) {
                    novaLinha = s.toCSV();
                } else if (novoObjeto instanceof Emprestimo e) {
                    novaLinha = e.toCSV();
                }

                lista.set(i, novaLinha.split(";"));
                break;
            }
        }

        salvarLista(nomeClasse, lista);
    }

    public static void salvar(String nomeClasse, String linhaCSV, int camposEsperados) {
        try {
            File dir = new File(DIRETORIO);
            if (!dir.exists()) dir.mkdir();
            FileWriter fw = new FileWriter(new File(dir, nomeClasse + ".csv"), true);
            fw.write(linhaCSV + "\n");
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    public static List<String[]> ler(String nomeClasse, int camposEsperados) {
        List<String[]> linhas = new ArrayList<>();
        File arq = new File(DIRETORIO, nomeClasse + ".csv");
        if (!arq.exists()) return linhas;
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if(camposEsperados>0){
                    if (partes.length == camposEsperados) {
                        linhas.add(partes);
                    }
                }else{
                    linhas.add(partes);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + e.getMessage());
        }
        return linhas;
    }

    public static void salvarLista(String nomeClasse, List<String[]> lista) {
        try {
            FileWriter fw = new FileWriter(new File(DIRETORIO, nomeClasse + ".csv"), false);
            for (String[] campos : lista) {
                fw.write(String.join(";", campos) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao sobrescrever arquivo: " + e.getMessage());
        }
    }

    public static int proximoId(String nomeClasse) {
        List<String[]> lista = ler(nomeClasse, -1);
        int maiorId = 0;

        for (String[] campos : lista) {
            try {
                int id = Integer.parseInt(campos[0]);
                if (id > maiorId) maiorId = id;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar id: " + e.getMessage());
            }
        }

        return maiorId + 1;
    }

    public static List<Usuario> lerUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (String[] campos : ler("Usuario", 5)) {
            try {
                int idUsuario = Integer.parseInt(campos[0]);
                String nome = campos[1];
                Date dataNascimento = sdf.parse(campos[2]);
                String telefone = campos[3];
                String email = campos[4];
                lista.add(new Usuario(idUsuario, nome, dataNascimento, telefone, email));
            } catch (Exception e) {
                System.err.println("Erro ao ler usuario: "+ e + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Livro> lerLivros() {
        List<Livro> lista = new ArrayList<>();
        for (String[] campos : ler("Livro", 5)) {
            try {
                int idLivro = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String tema = campos[2];
                String autor = campos[3];
                String isbn = campos[4];
                lista.add(new Livro(idLivro, nome, tema, autor, isbn));
            } catch (Exception e) {
                System.err.println("Erro ao ler livro: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Biblioteca> lerBiblioteca() {
        List<Biblioteca> lista = new ArrayList<>();
        for (String[] campos : ler("Biblioteca", 4)) {
            try {
                int idBiblioteca = Integer.parseInt(campos[0]);
                String nomeBiblioteca = campos[1];
                String endereco = campos[2];
                String telefone = campos[3];
                lista.add(new Biblioteca(idBiblioteca, nomeBiblioteca, endereco, telefone));
            } catch (Exception e) {
                System.err.println("Erro ao ler Biblioteca: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Secretaria> lerSecretarias() {
        List<Secretaria> lista = new ArrayList<>();
        for (String[] campos : ler("Secretaria", 3)) {
            try {
                int idSecretaria = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String turno = campos[2];
                lista.add(new Secretaria(idSecretaria, nome, turno));
            } catch (Exception e) {
                System.err.println("Erro ao ler secretaria: " + Arrays.toString(campos));
            }
        }
        return lista;
    }

    public static List<Emprestimo> lerEmprestimos() {
        List<Emprestimo> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (String[] campos : ler("Emprestimo", 6)) {
            try {
                int idEmprestimo = Integer.parseInt(campos[0]);
                int idUsuario = Integer.parseInt(campos[1]);
                int idLivro = Integer.parseInt(campos[2]);
                Date data = sdf.parse(campos[3]);
                Time hora = Time.valueOf(campos[4]);
                String status = campos[5];
                lista.add(new Emprestimo(idEmprestimo, idUsuario, idLivro, data, hora, status));
            } catch (Exception e) {
                System.err.println("Erro ao ler Emprestimo: " + Arrays.toString(campos));
            }
        }
        return lista;
    }
}
