aluno = {
    "aluno": "Carlos",
    "idade": "22",
    "Curso": "Engenharia"
}

aluno["Nota"] = 8.5

for chave, valor in aluno.items():
    print(f"{chave}: {valor}")