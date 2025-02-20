public class CrearMatriz2x2_Ejercicio4 {  // Define la clase MultiplicarMatrizPorEscalar
    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz 2x2
                {1, 2},
                {3, 4}
        };

        int escalar = 2;  // Define el escalar

        for (int i = 0; i < 2; i++) {  // Bucle para recorrer las filas
            for (int j = 0; j < 2; j++) {  // Bucle para recorrer las columnas
                matriz[i][j] *= escalar;  // Multiplica cada elemento por el escalar
            }
        }

        for (int i = 0; i < 2; i++) {  // Bucle para mostrar la matriz resultante
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");  // Imprime el valor de la posición [i][j]
            }
            System.out.println();  // Salto de línea después de imprimir una fila
        }
    }
}