package com.mycompany.algortimos;
import java.util.Scanner;

public class secuenciaaritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número de la secuencia: ");
        int inicio = teclado.nextInt();
        System.out.print("Ingrese la diferencia entre números: ");
        int diferencia = teclado.nextInt();
        System.out.print("Ingrese el número máximo de la secuencia: ");
        int maximo = teclado.nextInt();
        int numero = inicio;
        do {
            System.out.println(numero);
            numero += diferencia;
        } while (numero <= maximo);
    }
}
