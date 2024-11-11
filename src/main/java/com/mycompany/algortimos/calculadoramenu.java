package com.mycompany.algortimos;
import java.util.Scanner;

public class calculadoramenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una operación\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.print("Opción: ");
            int opcion = teclado.nextInt();
            if (opcion == 5) {
                break;
            }
            System.out.print("Ingrese el primer número: ");
            double num1 = teclado.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = teclado.nextDouble();
            switch (opcion) {
                case 1: 
                    System.out.println("Resultado: " + (num1 + num2));
                case 2: 
                    System.out.println("Resultado: " + (num1 - num2));
                case 3: 
                    System.out.println("Resultado: " + (num1 * num2));
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                default: 
                    System.out.println("Opción inválida.");
            }
        }
    }
}
