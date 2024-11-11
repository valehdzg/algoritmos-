package com.mycompany.algortimos;
import java.util.Scanner;
public class conteodenumeros {

public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cantidad = teclado.nextInt();
        int mayoresCero = 0, menoresCero = 0, igualesCero = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            if (numero > 0) {
                mayoresCero++;
            }
            else if (numero < 0) {
                menoresCero++;
            }
            else {
                    igualesCero++;
            }
        }

        System.out.println("Mayores que 0: " + mayoresCero);
        System.out.println("Menores que 0: " + menoresCero);
        System.out.println("Iguales a 0: " + igualesCero);
    }
}