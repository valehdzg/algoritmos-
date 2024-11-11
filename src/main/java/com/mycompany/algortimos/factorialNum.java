package com.mycompany.algortimos;
import java.util.Scanner;
public class factorialNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}


