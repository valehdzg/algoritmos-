/*
Calcular Precio con Descuento: Escribe un programa que calcule el precio final de 
un producto después de aplicar un descuento basado en el precio original. El descuento 
se determina de la siguiente manera:
Precio <= 100: Sin descuento
Precio > 100 y <= 200: 10% de descuento
Precio > 200 y <= 500: 20% de descuento
Precio > 500: 25% de descuento
*/
package com.mycompany.algortimos;

import java.util.Scanner;

public class precioDescuento {
    public static void main(String[] args) {
        double descuento = 0, precio_final = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el valor del producto: ");
        double precio = teclado.nextDouble();
        if (precio > 500) {
            precio_final = precio - (precio * 0.25);
        } else if (precio > 200 && precio <= 500) {
            precio_final = precio - (precio * 0.2);
        } else if (precio > 100 && precio <= 200) {
            precio_final = precio - (precio * 0.1);
        } else if (precio <= 100 && precio > 0) {
            precio_final = precio;
        } else if (precio < 0){
            System.out.println("Se introdujo un precio incorrecto.");
        } else {
            System.out.println("El precio final es " + precio_final);
        }
        
    }
}
