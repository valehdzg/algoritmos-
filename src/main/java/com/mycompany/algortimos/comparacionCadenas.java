/*
Comparación de Cadenas: Realiza un programa en el que se le solicite al usuario 
introducir 2 cadenas de texto; el programa debe de comparar si tienen la misma 
longitud e indicar si el contenido de ambas es igual
*/
import java.util.Scanner;

public class comparacionCadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = teclado.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = teclado.nextLine();
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen longitudes diferentes.");
        }
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }
    }
}
