/*
Suma de Elementos: Desarrolla un programa que lea 5 números enteros desde el teclado, 
los almacene en un array y calcule la suma de todos los elementos. Muestra la suma en la consola.
*/
import java.util.Scanner;

public class sumaElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        for(int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
}
