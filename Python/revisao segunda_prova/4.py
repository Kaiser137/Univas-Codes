def potencia(base, expoente):
    i = 1
    total = base
    while i < expoente:
        total = total * expoente
        i = i + 1
    return total

base = int(input("Digite o valor da base: "))
expoente = int(input("Digite o valor do expoente: "))

print("A potencia eh: ", potencia(base, expoente))