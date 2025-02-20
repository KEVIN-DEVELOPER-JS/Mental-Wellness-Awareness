public class FuncionSumaDosMatrizes2x2_Ejercicio7 {  // Define la clase SumaMatriz
    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {  // Define la función sumaMatriz
        int filas = matriz1.length;  // Obtiene el número de filas
        int columnas = matriz1[0].length;  // Obtiene el número de columnas
        int[][] resultado = new int[filas][columnas];  // Crea una matriz para almacenar el resultado

        for (int i = 0; i < filas; i++) {  // Bucle para recorrer las filas
            for (int j = 0; j < columnas; j++) {  // Bucle para recorrer las columnas
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];  // Suma las matrices
            }
        }

        return resultado;  // Devuelve la matriz resultante
    }

    public static void main(String[] args) {  // Método principal
        int[][] matriz1 = {  // Declara e inicializa la primera matriz
                {1, 2},
                {3, 4}
        };

        int[][] matriz2 = {  // Declara e inicializa la segunda matriz
                {5, 6},
                {7, 8}
        };

        int[][] resultado = sumaMatriz(matriz1, matriz2);  // Llama a la función sumaMatriz

        for (int[] ints : resultado) {  // Bucle para mostrar el resultado
            for (int anInt : ints) {
                System.out.print(anInt + " ");  // Imprime el valor de la posición [i][j]
            }
            System.out.println();  // Salto de línea después de imprimir una fila
        }
    }
}

