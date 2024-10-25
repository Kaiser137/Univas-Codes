num1 = int(input("Digite o 1 numero: "))
num2 = int(input("Digite o 2 numero: "))
num3 = int(input("Digite o 3 numero: "))

if num1 < num2 and num1 < num3:
    print("O numero 1: ", num1, " eh o menor!")

elif num2 < num1 and num2 < num3:
    print("O numero 2: ", num2, " eh o menor!")

else:
    print("O numero 3: ", num3, " eh o menor!")
