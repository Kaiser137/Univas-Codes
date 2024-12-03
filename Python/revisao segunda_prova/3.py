def numero_positivo(n):
    if n >= 0:
        verifica = ("True")
    else:
        verifica = ("Flase")
    return verifica

numero = int(input("Digite um numero: "))
print(numero_positivo(numero))