public class TransponerMatriz3x2_Ejercicio8  {  // Define la clase TransponerMatriz
    public static int[][] transponerMatriz(int[][] matriz) {  // Define la función transponerMatriz
        int filas = matriz.length;  // Obtiene el número de filas
        int columnas = matriz[0].length;  // Obtiene el número de columnas
        int[][] transpuesta = new int[columnas][filas];  // Crea una matriz para almacenar la transpuesta

        for (int i = 0; i < filas; i++) {  // Bucle para recorrer las filas
            for (int j = 0; j < columnas; j++) {  // Bucle para recorrer las columnas
                transpuesta[j][i] = matriz[i][j];  // Intercambia filas por columnas
            }
        }

        return transpuesta;  // Devuelve la matriz transpuesta
    }

    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transpuesta = transponerMatriz(matriz);  // Llama a la función transponerMatriz

        for (int[] ints : transpuesta) {  // Bucle para mostrar la matriz transpuesta
            for (int anInt : ints) {
                System.out.print(anInt + " ");  // Imprime el valor de la posición [i][j]
            }
            System.out.println();  // Salto de línea después de imprimir una fila
        }
    }
}
