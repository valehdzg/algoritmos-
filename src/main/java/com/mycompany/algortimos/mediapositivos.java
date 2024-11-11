package com.mycompany.algortimos;
import java.util.Scanner;

public class mediapositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, contador = 0;
        while (true) {
            System.out.print("Ingrese un número positivo (negativo para terminar): ");
            int numero = teclado.nextInt();
            if (numero < 0) break;
            suma += numero;
            contador++;
        }
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}
