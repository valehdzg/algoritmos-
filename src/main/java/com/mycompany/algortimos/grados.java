/*
Convertidor de grados:  Escribe un programa que convierta una temperatura dada en grados Celsius a 
Fahrenheit o Kelvin, según la elección del usuario.
Indicaciones:

Pedirle al usuario que ingrese la temperatura en grados Celsius.
Mostrar un menú con opciones para convertir a Fahrenheit o Kelvin.
Usar switch para realizar la conversión seleccionada.
Imprime la temperatura convertida.
 */
package com.mycompany.algortimos;

import java.util.Scanner;

public class grados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = teclado.nextDouble();
        System.out.println("Ingresa el numero de la opcion a la que quieres convertir los grados:\n1) Fahrenheit\n2) Kelvin");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C son " + fahrenheit + " °F");
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.println(celsius + " °C son " + kelvin + " K");
                break;
            default:
                System.out.println("Ingresaste un numero que no esta dentro de las opciones.");
        }
    }
}
