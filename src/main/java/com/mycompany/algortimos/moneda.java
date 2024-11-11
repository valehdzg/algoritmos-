/*
Conversor de monedas: Escribe un programa que convierta una cantidad ingresada en pesos mexicanos a 
diferentes monedas extranjeras utilizando una estructura Switch.
Monedas a convertir:

Dólar (USD)
Euro (EUR)
Bath (THB)
Yen (JPY)
Won (KRW)
Dólar Australiano (AUD)
Sol (PEN)
Dólar Canadiense (CAD)
Bolívar (VES)
Peso Argentino (ARS)

 */
package com.mycompany.algortimos;

import java.util.Scanner;

public class moneda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        double mxn = teclado.nextDouble();
        System.out.println("Ingresa el numero de la opcion a la que quieres convertir la moneda:\n1) Dolar (USD)\n2) Euro (EUR)"
                + "\n3) Baht (THB)\n4) Yen (JPY)\n5) Won (KRW)\n6) Dolar australiano (AUD)\n7) Sol (PEN)\n8) Dolar canadiense (CAD)"
                + "\n9) Bolivar (VES)\n10) Peso argentino (ARS)");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                double usd = mxn * 0.050;
                System.out.println(mxn + " MXN son " + usd + " USD");
                break;
            case 2:
                double eur = mxn * 0.046;
                System.out.println(mxn + " MXN son " + eur + " EUR");
                break;
            case 3:
                double thb = mxn * 1.70;
                System.out.println(mxn + " MXN son " + thb + " THB");
                break;
            case 4:
                double jpy = mxn * 7.56;
                System.out.println(mxn + " MXN son " + jpy + " JPY");
                break;
            case 5:
                double krw = mxn * 69.31;
                System.out.println(mxn + " MXN son " + krw + " KRW");
                break;
            case 6:
                double aud = mxn * 0.075;
                System.out.println(mxn + " MXN son " + aud + " AUD");
                break;
            case 7:
                double pen = mxn * 0.19;
                System.out.println(mxn + " MXN son " + pen + " PEN");
                break;
            case 8:
                double cad = mxn * 0.069;
                System.out.println(mxn + " MXN son " + cad + " CAD");
                break;
            case 9:
                double ves = mxn * 2.21;
                System.out.println(mxn + " MXN son " + ves + " VES");
                break;
            case 10:
                double ars = mxn * 50.02;
                System.out.println(mxn + " MXN son " + ars + " ARS");
                break;
            default:
                System.out.println("Ingresaste un numero que no esta dentro de las opciones.");
        }
    }
}
