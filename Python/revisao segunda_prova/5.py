def divisivel_por_3(n):
    if n % 3 == 0:
        verifica = ("True")
    else:
        verifica = ("False")
    return verifica

div = int(input("Digite um numero: "))

print(divisivel_por_3(div))