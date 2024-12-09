/*
Conversión de Fechas: Crea un programa que permita al usuario ingresar una fecha 
con el formato "YYYY-MM-DD" y, usando LocalDate, muestre la fecha una semana después 
y un mes antes
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class conversionFechas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una fecha en formato YYYY-MM-DD: ");
        String fechaEntrada = teclado.nextLine();
        LocalDate fecha = LocalDate.parse(fechaEntrada);
        LocalDate unaSemanaDespues = fecha.plusWeeks(1);
        LocalDate unMesAntes = fecha.minusMonths(1);
        System.out.println("Una semana despues: " + unaSemanaDespues);
        System.out.println("Un mes antes: " + unMesAntes);
    }
}