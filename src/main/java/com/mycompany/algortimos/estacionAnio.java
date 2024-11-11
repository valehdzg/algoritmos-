/*
Determinar la estación del año: Escribe un programa que determine la estación del año basándose en un 
número de mes ingresado por el usuario.
Indicaciones:

Pedirle al usuario que ingrese un número de mes (1-12).
Usar switch para determinar la estación del año.
Imprime la estación correspondiente.
 */
package com.mycompany.algortimos;

import java.util.Scanner;

public class estacionAnio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero del 1 al 12: ");
        int estacion = teclado.nextInt();
        switch (estacion) {
            case 1:
                System.out.println("La estación es invierno.");
                break;
            case 2:
                System.out.println("La estación es invierno.");
                break;
            case 3:
                System.out.println("La estación es invierno.");
                break;
            case 4:
                System.out.println("La estación es primavera.");
                break;
            case 5:
                System.out.println("La estación es primavera.");
                break;
            case 6:
                System.out.println("La estación es verano.");
                break;
            case 7:
                System.out.println("La estación es verano.");
                break;
            case 8:
                System.out.println("La estación es verano.");
                break;
            case 9:
                System.out.println("La estación es verano.");
                break;
            case 10:
                System.out.println("La estación es otoño.");
                break;
            case 11:
                System.out.println("La estación es otoño.");
                break;
            case 12:
                System.out.println("La estación es otoño.");
                break;
            default:
                System.out.println("Ese valor es incorrecto.");;
        }
    }
}
