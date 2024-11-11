triangulo_1 = int(input("Digite o valor do primeiro triangulo: "))
triangulo_2 = int(input("Digite o valor do segundo triangulo: "))
triangulo_3 = int(input("Digite o valor do terceiro triangulo: "))

if triangulo_1 == triangulo_2 == triangulo_3:
    print("Seu triangulo é equilátero!")
elif triangulo_1 == triangulo_2 or triangulo_1 == triangulo_3 or triangulo_2 == triangulo_3:
    print("Seu triangulo é isósceles!")
else:
    print("Seu triangulo é escaleno!")  

