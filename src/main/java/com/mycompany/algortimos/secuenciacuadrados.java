package com.mycompany.algortimos;
import java.util.Scanner;

public class secuenciacuadrados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        int i = 1;
        do {
            System.out.println("El cuadrado de " + i + " es " + (i * i));
            i++;
        } while (i <= numero);
    }
}
