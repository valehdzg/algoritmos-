/*
Escribe un programa en Java que pida al usuario ingresar una cantidad de números 
en un array (el tamaño de este debe de ser determinado por el usuario) e ingrese 
los números por teclado y luego los ordene en orden ascendente utilizando el método 
de ordenamiento burbuja. Al final, el programa debe mostrar el arreglo ordenado.
*/

import java.util.Scanner;

public class ordenamientoBurbuja {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de numeros: ");
        int n = teclado.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("Array ordenado en orden ascendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
