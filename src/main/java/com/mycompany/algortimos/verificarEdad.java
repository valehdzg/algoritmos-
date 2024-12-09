/*
Verificar Edad: Realiza un programa que verifique si una persona puede votar o no; 
se deberá de generar una función que devuelva un valor falso o verdadero
 */
import java.util.Scanner;
public class verificarEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (puedeVotar(edad)) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }
    }
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }
}

