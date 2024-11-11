package com.mycompany.algortimos;
import java.util.Scanner;

public class Contadorimpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
    }
}
