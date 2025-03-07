import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        switch (dia) {
            case "lunes", "martes", "miércoles", "jueves", "viernes" -> System.out.println("Es un día laboral.");
            case "sábado", "domingo" -> System.out.println("No es un día laboral.");
            default -> System.out.println("Día no válido.");
        }
    }
}