carros = {
    "CarroA": 50000,
    "CarroB": 30000,
    "CarroC": 40000,
    "CarroD": 60000,
    "CarroE": 45000
}

carros_ordenados = sorted(carros.items(), key=lambda x: x[1], reverse=True)
for i in range(2):
    carros.pop(carros_ordenados[i][0])

print(carros)
