import java.util.Scanner;

public class SumaHastaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número mayor que 1: ");
        int numero = scanner.nextInt();

        if (numero > 1) {
            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma += i;
            }
            System.out.println("La suma desde 1 hasta " + numero + " es: " + suma);
        } else {
            System.out.println("El número debe ser mayor que 1.");
        }
    }
}