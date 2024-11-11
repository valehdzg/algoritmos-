package com.mycompany.algortimos;

import java.util.Scanner;

public class contadordigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
