import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        double resultado;
        if (exponente > 0) {
            resultado = Math.pow(base, exponente);
        } else if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = 1 / Math.pow(base, -exponente);
        }

        System.out.println("El resultado es: " + resultado);
    }
}