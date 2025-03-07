import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número entero positivo: ");
            numeros[i] = scanner.nextInt();
            while (numeros[i] < 0) {
                System.out.print("El número debe ser positivo. Inténtalo de nuevo: ");
                numeros[i] = scanner.nextInt();
            }
        }

        int positivos = 0, negativos = 0, ceros = 0;
        for (int num : numeros) {
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }

        System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Ceros: " + ceros);
    }
}