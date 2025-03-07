public class CrearMatriz3x3_Ejercicio1 {  // Define la clase C
    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz 3x3 con valores específicos
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ints : matriz) {  // Bucle para recorrer las filas
            for (int anInt : ints) {  // Bucle para recorrer las columnas
                System.out.print(anInt + " ");  // Imprime el valor de la posición [i][j]
            }
            System.out.println();  // Salto de línea después de imprimir una fila
        }
    }
}


