idade = float(input("Digite sua idade: "))

if (idade < 16):
    print("Não vota!")

elif ((idade < 18) or (idade >= 70)):
    print("Voto opcional!")
    
else:
    print("Voto obrigatório!") 

print("FIM!")   
