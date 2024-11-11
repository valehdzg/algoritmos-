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

import java.util.Scanner;

public class calificacionesFinales {
    public static void main(String[] args) {
        boolean x = true;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa la nota de los parciales: ");
            double parcial = teclado.nextDouble();
            System.out.print("Ingresa la nota del proyecto: ");
            double proyecto = teclado.nextDouble();
            System.out.print("Ingresa la nota del examen final: ");
            double examen = teclado.nextDouble();
            if (parcial > 0 && parcial < 100 || proyecto > 0 && proyecto < 100 || examen > 0 && examen < 100) {
                double calificacionFInal = (parcial * 0.4) + (proyecto * 0.3) + (examen * 0.5);
            } else {
                System.out.println("Alguna calificación no fue introducida correctamente. Intenta de nuevo, por favor.");
            }
        } while (x);       
    }
}
