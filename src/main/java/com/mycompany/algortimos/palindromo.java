/*
Palíndromo:  Desarrolla un programa en el cual el usuario ingrese una cadena de 
texto; y a través de una función se determine si la cadena de texto ingresada es 
un palíndromo. Si la cadena de texto es palíndromo deberá de mostrar el mensaje 
"Es un palíndromo", si no lo es deberá de mostrar "No es palíndromo"
 */
import java.util.Scanner;
public class palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = teclado.nextLine();
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(textoInvertido);
    }
}

