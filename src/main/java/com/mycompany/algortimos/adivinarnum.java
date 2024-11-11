package com.mycompany.algortimos;
import java.util.Scanner;
import java.util.Random;

public class adivinarnum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;
        do {
            System.out.print("Adivine el número (1-100): ");
            intento = teclado.nextInt();
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto.");
            }
        } while (intento != numeroAleatorio);
        System.out.println("¡Correcto! El número era " + numeroAleatorio);
    }
}
