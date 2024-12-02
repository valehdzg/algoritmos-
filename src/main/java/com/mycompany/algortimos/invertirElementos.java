/*
Invertir Elementos: Desarrolla un programa que lea 6 números enteros desde el teclado, 
los almacene en un array y luego invierta el orden de los elementos. Muestra el array invertido en la consola.
 */
import java.util.Scanner;

public class invertirElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.print("Array invertido: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}

