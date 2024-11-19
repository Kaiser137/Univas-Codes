produtos = {
    "Camiseta": 45.0,
    "Calça": 89.90,
    "Tênis": 120.0,
    "Jaqueta": 250.0
}

for produto in produtos:
    produtos[produto] = round(produtos[produto] * 0.85, 2)

print(produtos)
