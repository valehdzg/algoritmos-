/*
Encontrar número Mayor y Menor: Desarrolla un programa que lea 8 números enteros 
desde el teclado, los almacene en un array y determine cuál es el número mayor y 
cuál es el número menor. Muestra ambos números en la consola.
*/

import java.util.Scanner;

public class mayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor = 0, menor = 0;
        for(int i = 0; i < 8; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        menor = numeros[0];
        mayor = menor;
        for(int num : numeros) {
            if(num > mayor) {
                mayor = num;
            }
            if(num < menor) {
                menor = num;
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
