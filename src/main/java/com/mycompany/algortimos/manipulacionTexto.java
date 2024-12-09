/*
Manipulación de Texto: Crea un programa en donde el usuario ingrese un texto largo 
y cuente cuantas veces aparece la palabra "ingeniería".
*/
import java.util.Scanner;
public class manipulacionTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un texto largo:");
        String texto = teclado.nextLine();
        String palabra = "ingeniería";
        int contador = 0;
        String[] palabras = texto.toLowerCase().split("\\s+");
        for (String p : palabras) {
            if (p.equals(palabra)) {
                contador++;
            }
        }
        System.out.println("La palabra 'ingeniería' aparece " + contador + " veces.");
    }
}

