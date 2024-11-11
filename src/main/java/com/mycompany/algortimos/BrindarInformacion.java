/*
Brindar información: Escribe un programa que permita al usuario ingresar el nombre de un artista, una película, 
serie o algo de su preferencia y le brinde información sobre lo que eligió utilizando una estructura Switch; 
se debera agregar por lo menos 5 casos.
 */
package com.mycompany.algortimos;

import java.util.Scanner;

public class BrindarInformacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de un artista, película, serie o algo de su preferencia:");
        String eleccion = teclado.nextLine().toLowerCase();

        switch (eleccion) {
            case "Adele":
                System.out.println("s una de las cantantes y compositoras de mayor potencia vocal, cuya portentosa voz refleja en un repertorio musical centrado en las baladas de estilo combinado entre el soul y el pop con influencias del jazz.");
                break;
            case "Harry Potter":
                System.out.println("Harry Potter es una serie de libros escrita por J.K. Rowling sobre un joven mago y sus aventuras en la escuela de magia Hogwarts.");
                break;
            case "Gossip Girl":
                System.out.println("es una serie estadounidensa que habla sobre la vida (chismes) de 7 adolescentes y su vida en Manhattan");
                break;
            case "Ed maverik":
                System.out.println("es un cantautor, productor y músico multinstrumentista mexicano. Se especializa en los géneros de música folk, alterlatino y rock latino.");
                break;
            case "Jim Carrey":
                System.out.println("es un actor y comediante canadoestadounidense. Es conocido por sus interpretaciones cómicas slapstick.");
                break;
            default:
                System.out.println("Lo siento, no tengo información sobre esa elección.");
                break;
        }

    }
}
