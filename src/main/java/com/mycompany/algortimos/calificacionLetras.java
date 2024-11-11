/*
Evaluacion de Calificaciones con Letras:  Escribe un programa que evalúe una calificación numérica 
y asigne una letra (A, B, C, D, F) basada en los siguientes rangos:

90-100: A
80-89: B
70-79: C
60-69: D
Menos de 60: F

 */
package com.mycompany.algortimos;

import java.util.Scanner;

public class calificacionLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa tu calificacion de 0 a 100: ");
        int calif = teclado.nextInt();
        if (calif >= 0 && calif <= 100) {
            if (calif >= 90 && calif <= 100) {
                System.out.println("Calificacion A");
            } else if (calif >= 80 && calif <= 89) {
                System.out.println("Calificacion B");
            } else if (calif >= 70 && calif <= 79) {
                System.out.println("Calificacion C");
            } else if (calif >= 60 && calif <= 69) {
                System.out.println("Calificacion D");
            } else if (calif < 60) {
                System.out.println("Calificacion F");
            }
        }
        else {
            System.out.println("Ingresaste una calificacion invalida.");
        }
    }
}
