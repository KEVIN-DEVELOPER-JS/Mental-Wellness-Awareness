import java.util.Scanner;

public class PrecioConIVA {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();
        double precioFinal = precio * (1 + IVA);

        System.out.printf("El precio final con IVA es: %.2f%n", precioFinal);
    }
}