public class CrearMatriz3x3_Ejercicio5 {  // Define la clase SumarElementosMatriz3x3
    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz 3x3
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int suma = 0;  // Inicializa la variable suma

        // Bucle para recorrer las filas
        for (int[] ints : matriz) {
            for (int anInt : ints) {  // Bucle para recorrer las columnas
                suma += anInt;  // Suma cada elemento a la variable suma
            }
        }

        System.out.println("La suma de todos los elementos de la matriz es: " + suma);  // Imprime la suma
    }
}
