import java.util.Scanner;

public class CompraConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        String[] artefactos = {"plancha", "licuadora", "lavadora", "cocina"};
        double[] precios = {200, 150, 800, 1200};

        double total = 0;
        for (double precio : precios) {
            total += precio;
        }

        double descuento = (total > 1200) ? 0.17 : 0;
        double totalConDescuento = total * (1 - descuento);

        System.out.println("Cliente: " + cliente);
        for (int i = 0; i < artefactos.length; i++) {
            System.out.printf("%s: $%.2f%n", artefactos[i], precios[i]);
        }
        System.out.printf("Descuento: %.0f%%%n", descuento * 100);
        System.out.printf("Total a pagar: $%.2f%n", totalConDescuento);
    }
}