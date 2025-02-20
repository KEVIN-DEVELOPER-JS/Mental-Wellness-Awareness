public class CrearDosMatrizes2x2_Ejercicio2 {  // Define la clase SumaMatrices2x2
    public static void main(String[] args) {  // Método principal
        int[][] matriz1 = {  // Declara e inicializa la primera matriz 2x2
                {1, 2},
                {3, 4}
        };

        int[][] matriz2 = {  // Declara e inicializa la segunda matriz 2x2
                {5, 6},
                {7, 8}
        };

        int[][] resultado = new int[2][2];  // Crea una matriz para almacenar el resultado

        for (int i = 0; i < 2; i++) {  // Bucle para recorrer las filas
            for (int j = 0; j < 2; j++) {  // Bucle para recorrer las columnas
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];  // Suma las matrices
            }
        }

        for (int i = 0; i < 2; i++) {  // Bucle para mostrar el resultado
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");  // Imprime el valor de la posición [i][j]
            }
            System.out.println();  // Salto de línea después de imprimir una fila
        }
    }
}
