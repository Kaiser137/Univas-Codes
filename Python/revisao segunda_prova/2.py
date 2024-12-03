def area_circulo(raio):
    area = (raio * raio) * 3.14
    return area

raio = float(input("Digite o raio: "))
print("A área eh: ", area_circulo(raio))