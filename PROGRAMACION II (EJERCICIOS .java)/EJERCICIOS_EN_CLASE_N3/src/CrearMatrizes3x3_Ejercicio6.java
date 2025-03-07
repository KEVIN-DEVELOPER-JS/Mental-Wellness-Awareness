public class CrearMatrizes3x3_Ejercicio6  {  // Define la clase ContarParesMatriz3x3
    public static void main(String[] args) {  // Método principal
        int[][] matriz = {  // Declara e inicializa una matriz 3x3
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int contadorPares = 0;  // Inicializa el contador de números pares

        for (int[] ints : matriz) {  // Bucle para recorrer las filas
            for (int anInt : ints) {  // Bucle para recorrer las columnas
                if (anInt % 2 == 0) {  // Verifica si el número es par
                    contadorPares++;  // Incrementa el contador si es par
                }
            }
        }

        System.out.println("La cantidad de números pares en la matriz es: " + contadorPares);  // Imprime el resultado
    }
}


