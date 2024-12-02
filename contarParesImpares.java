/*
Contar números pares e impares: Desarrolla un programa que lea 10 números enteros 
desde el teclado y los almacene en un array. Luego, el programa debe contar cuántos 
números son pares y cuántos son impares y mostrar estos conteos en la consola.
*/
import java.util.Scanner;

public class contarParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0;
        for(int i = 0; i < 10; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        for(int num : numeros) {
            if(num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}
