public class Suma1a50 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        System.out.println("La suma de los números del 1 al 50 es: " + suma);
    }
}