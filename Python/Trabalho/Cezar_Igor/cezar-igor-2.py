lista = ["Joaz", "Robinho", "Nicollau", "Neymar", "João", "Igor", "Cezar", "Vini", "André", "Téo"]
print("os 3 nomes são: ")
print(lista[0:3])
lista.sort()
print("Em ordem alfabética: ")
print(lista)
uppercase_lista = [name.upper() for name in lista] 
print("Nomes em maiusculo: ")
print(uppercase_lista)
