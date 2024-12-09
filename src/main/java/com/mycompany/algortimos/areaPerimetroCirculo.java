/*
Área y Perímetro de Circulo: Realiza un programa que calcule el área y perímetro 
de un circulo. El programa deberá recibir la medida del radio por parte del usuario 
y se deberán de generar 2 funciones: una para el área y la otra para el perímetro y 
ambas deberán devolver el resultado.
*/
import java.util.Scanner;
public class areaPerimetroCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = teclado.nextDouble();
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
    }
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
