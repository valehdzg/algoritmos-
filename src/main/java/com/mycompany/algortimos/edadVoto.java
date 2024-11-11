/*2.  Verificar edad para votar: Escribe un programa que verifique si una persona es elegible 
para votar. La edad mínima para votar es de 18 años.
*/
package com.mycompany.algortimos;

import java.util.Scanner;

public class edadVoto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18 && edad < 120) {
            System.out.println("Puedes votar.");
        } else if (edad < 18 && edad > 0) {
            System.out.println("No puedes votar.");
        } else {
            System.out.println("Ingresaste una edad inválida.");
        }
    }
}
