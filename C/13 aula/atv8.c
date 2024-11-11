#include <stdbool.h>
#include <stdio.h>
//sla oq é isso
void swap(int* xp, int* yp){
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
    //Função bubbleSort
void bubbleSort(int arr[], int n){
    int i, j;
    bool swapped;
    for (i = 0; i < n - 1; i++) {
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(&arr[j], &arr[j + 1]);
                swapped = true;
            }
        }
    //braak por diferença
        if (swapped == false)
            break;
    }
}

// Função que printa o array
void printArray(int arr[], int size){
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
}

int main(){
    int arr[10]; // Define um array para 10 números
    int n = sizeof(arr) / sizeof(arr[0]);

    // Solicita ao usuário para inserir 10 números
    printf("Insira 10 números:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    bubbleSort(arr, n);
    printf("Array ordenado:\n");
    printArray(arr, n);
}