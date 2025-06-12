import javax.swing.*;
import java.io.*;
import java.util.*;

public class CadastroProduto extends JFrame {
    private JLabel labelCodigoProduto, labelNomeProduto, labelQuantidadeProduto, labelDatadeValidade;
    private JTextField tfCodigoProduto, tfNomeProduto, tfQuantidadeProduto, tfDatadeValidade;
    private JButton btInserirProduto, btListarProduto;
    private File pasta = new File("Java/2 ciclo/trabalho3/meusprodutos/");
    private File arquivo = new File(pasta, "produtos.txt");

    public static void main(String[] args) {
        new CadastroProduto();
    }

    public CadastroProduto() {
        setTitle("Cadastro de Produtos");
        setSize(335, 225);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelCodigoProduto = new JLabel("Código do Produto:");
        labelNomeProduto = new JLabel("Nome do Produto:");
        labelQuantidadeProduto = new JLabel("Quantidade:");
        labelDatadeValidade = new JLabel("Data de Validade:");
        tfCodigoProduto = new JTextField();
        tfNomeProduto = new JTextField();
        tfQuantidadeProduto = new JTextField();
        tfDatadeValidade = new JTextField();
        btInserirProduto = new JButton("Inserir Produto");
        btListarProduto = new JButton("Listar Produtos");

        labelCodigoProduto.setBounds(10, 10, 150, 20);
        tfCodigoProduto.setBounds(10, 30, 300, 20);
        labelNomeProduto.setBounds(10, 55, 150, 20);
        tfNomeProduto.setBounds(10, 75, 300, 20);
        labelQuantidadeProduto.setBounds(10, 100, 150, 20);
        tfQuantidadeProduto.setBounds(10, 120, 145, 20);
        labelDatadeValidade.setBounds(165, 100, 150, 20);
        tfDatadeValidade.setBounds(165, 120, 145, 20);
        btInserirProduto.setBounds(10, 150, 145, 25);
        btListarProduto.setBounds(165, 150, 145, 25);

        add(labelCodigoProduto);
        add(tfCodigoProduto);
        add(labelNomeProduto);
        add(tfNomeProduto);
        add(labelQuantidadeProduto);
        add(tfQuantidadeProduto);
        add(labelDatadeValidade);
        add(tfDatadeValidade);
        add(btInserirProduto);
        add(btListarProduto);

        btInserirProduto.addActionListener(e -> inserirProdutos());
        btListarProduto.addActionListener(e -> listarProdutos());

        setVisible(true);
    }

    private List<String[]> carregarProdutos(){
        List<String[]> produtos = new ArrayList<>();

        if(arquivo.exists()){
            try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(";");

                    if(partes.length == 4){
                        produtos.add(new String[]{partes[0].trim(), partes[1].trim(), partes[2].trim(), partes[3].trim()});
                    }
                }
            } catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo: " + ex.getMessage());
            }
        }
        return produtos;
    }

    private void inserirProdutos(){
        String codigoTexto = tfCodigoProduto.getText().trim();
        String nomeProduto = tfNomeProduto.getText().trim();
        String quantidadeTexto = tfQuantidadeProduto.getText().trim();
        String dataValidade = tfDatadeValidade.getText().trim();

        if(codigoTexto.isEmpty() || nomeProduto.isEmpty() || quantidadeTexto.isEmpty() || dataValidade.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        int quantidade;
        try {
            quantidade = Integer.parseInt(quantidadeTexto);
            if(quantidade <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida.");
            return;
        }

        if(!pasta.exists()){
            pasta.mkdirs();
        }

    List<String[]> produtos = carregarProdutos();

        for(String[] produto : produtos){
            if(produto[0].equalsIgnoreCase(codigoTexto)){
                JOptionPane.showMessageDialog(this, "Este produto já está cadastrado.");
                return;
            } 
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            writer.write(codigoTexto + "; " + nomeProduto + "; " + quantidade + "; " + dataValidade);
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            tfCodigoProduto.setText("");
            tfNomeProduto.setText("");
            tfQuantidadeProduto.setText("");
            tfDatadeValidade.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o produto: " + ex.getMessage());
        }
    }

    private void listarProdutos() {
        List<String[]> produtos = carregarProdutos();
        if (produtos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado.");
        } else {
            String mensagem = "Produtos: \n";
            for (String[] produto : produtos) {
                mensagem += "código: " + produto[0] + "; Nome: " + produto[1] + "; Quantidade: " + produto[2] + "; Data de Validade: " + produto[3] + "\n";
            }
            JTextArea textArea = new JTextArea(mensagem.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(350, 250));

            JOptionPane.showConfirmDialog(this, scrollPane, "Produtos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
