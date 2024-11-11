package com.mycompany.algortimos;
import java.util.Scanner;

public class vocalesonovocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese una letra (espacio para salir): ");
            char letra = teclado.next().charAt(0);
            if (letra == ' ') {
                break;
            }
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " es una consonante.");
            }
        }
    }
}
