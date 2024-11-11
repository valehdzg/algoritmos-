/*
1. Calculadora de Calificaciones Finales:  Escribe un programa que calcule la nota final de un estudiante 
en una materia, basándose en tres notas: parciales, proyecto y examen final. El programa debe pedir al usuario 
que ingrese estas tres notas y luego calcular la nota final usando los siguientes pesos:

Parciales: 40%
Proyecto: 30%
Examen final: 30%
Las condiciones son las siguientes: 
El usuario debe ingresar las 3 calificaciones
El rango de las calificaciones debe de ser de 0 a 100
Se debe de calcular la calificacion final usando los porcentajes indicados
Imprimir el promedio final
*/
package com.mycompany.algortimos;

import java.util.Scanner;

public class calificacionesFinales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la calificación de los parciales de 0 a 100: ");
        double parciales = teclado.nextDouble();
        if (parciales < 0 || parciales > 100) {
            System.out.print("Error: la calificación de los parciales debe estar entre 0 y 100.");
            return;
        }
        System.out.print("Ingrese la calificación del proyecto de 0 a 100: ");
        double proyecto = teclado.nextDouble();
        if (proyecto < 0 || proyecto > 100) {
            System.out.print("Error: la calificación del proyecto debe estar entre 0 y 100.");
            return;
        }
        System.out.print("Ingrese la calificación del examen final de 0 a 100:");
        double examenFinal = teclado.nextDouble();
        if (examenFinal < 0 || examenFinal > 100) {
            System.out.print("Error: la calificación del examen final debe estar entre 0 y 100.");
            return;
        }
        double calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
        System.out.printf("La calificación final es: %.2f\n", calificacionFinal);
    }
}
