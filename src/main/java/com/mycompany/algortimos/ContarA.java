package com.mycompany.algortimos;

import java.util.Scanner;

public class ContarA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = teclado.nextLine();
        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}
