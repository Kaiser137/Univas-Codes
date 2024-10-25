jogador1 = input("Jogador 1: Digite pedra, papel ou tesoura: ")
jogador2 = input("Jogador 2: Digite pedra, papel ou tesoura: ")

if (((jogador1 == "pedra") and (jogador2 == "tesoura")) or ((jogador1 == "papel") and (jogador2 == "pedra")) or ((jogador1 == "tesoura") and (jogador2 == "papel"))):
    print("Jogador 1 venceu!")
    
else:
    print("Jogador 2 venceu!")