/*
Convertir nombres: Realiza un programa que reciba el nombre completo de una 
persona en minusculas y lo convierta en formato de titulo (por ejemplo, "juan 
perez" → "Juan Perez"). El programa se debe de ejecutar n veces hasta que el 
usuario ingrese la palabra "salir".
*/
import java.util.Scanner;
public class convertirNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese un nombre completo (o escriba 'salir' para terminar): ");
            String entrada = teclado.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            String[] palabras = entrada.split(" ");
            StringBuilder nombreFormateado = new StringBuilder();
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    nombreFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                                     .append(palabra.substring(1).toLowerCase())
                                     .append(" ");
                }
            }
            System.out.println("Nombre formateado: " + nombreFormateado.toString().trim());
        }
    }
}