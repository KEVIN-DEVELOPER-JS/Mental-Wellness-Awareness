public class CrearMatriz3x3_Ejercicio3 {  // Define la clase MaximoMatriz3x3
    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz 3x3
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maximo = matriz[0][0];  // Inicializa la variable maximo con el primer valor de la matriz

        // Bucle para recorrer las filas
        for (int j = 0; j < matriz[0].length; j++) {  // Bucle para recorrer las columnas
            if (matriz[0][j] > maximo) {  // Compara el valor actual con maximo
                maximo = matriz[0][j];  // Actualiza maximo si el valor actual es mayor
            }
        }
        for (int j = 0; j < matriz[1].length; j++) {  // Bucle para recorrer las columnas
            if (matriz[1][j] > maximo) {  // Compara el valor actual con maximo
                maximo = matriz[1][j];  // Actualiza maximo si el valor actual es mayor
            }
        }
        for (int j = 0; j < matriz[2].length; j++) {  // Bucle para recorrer las columnas
            if (matriz[2][j] > maximo) {  // Compara el valor actual con maximo
                maximo = matriz[2][j];  // Actualiza maximo si el valor actual es mayor
            }
        }

        System.out.println("El valor máximo en la matriz es: " + maximo);  // Imprime el valor máximo
    }
}
