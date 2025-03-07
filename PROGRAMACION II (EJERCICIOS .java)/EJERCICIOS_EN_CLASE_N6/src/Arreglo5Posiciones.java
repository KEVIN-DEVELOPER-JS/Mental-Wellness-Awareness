import java.util.Scanner;

public class Arreglo5Posiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arreglo = new double[5];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextDouble();
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + arreglo[i]);
        }
    }
}