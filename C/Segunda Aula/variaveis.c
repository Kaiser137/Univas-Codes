#include <stdio.h>

int main(){
    char letra = 'a'; // Declaração de váriavel
    letra = 'b'; // Aspas simples para representar um único caracter

    int numero = 10;
    numero = 20;

    float numero_decimal = 10.5;
    numero_decimal = 10; // 10.0

    double numero_decimal_preciso = 20.05; // Double permite usar mais casas decimais do que o float

    // letras, dígitos ou underline (_)
    // primeiro caracter não pode ser um dígito
    // exemplo: 9idade (X); idade9 (ok)
    // int int; (Não posso ter variável com nome sendo um comando do código)

    //int idade; // ok
    //int Num_cliente; //ok
    //float a1b2c3; // OK
    //float 7a2bc3c; // (X)
    //char float; // (X)
    //double vinte%; // (X)
    //char sim?nao; // (X)
    //int _alfa; // OK
    //int _123; // OK, mas não é aconselhavel
    //char Num, NUM; // ok

        // padroes de nomenclatura
        int numero_1, numero_um;
        int numero1, Numero1; // camelCase

    printf("Impressao dos valores:\n\n");
    printf("Numero: %d\n\n", numero);
    printf("Numero: %f\n", numero_decimal);
    printf("Numero: %2.f\n\n", numero_decimal);
    printf("Letra: %c\n\n", letra);

    /*
        + = adição (resultado = numero1 + numero2)
        - = subtração (numero1 - numero2)
        / = divisão (numero1 / numero2)
        * = multiplicação (numero1 * numero2)
        % = resto da divisão (numero1 % numero2)
     */
}