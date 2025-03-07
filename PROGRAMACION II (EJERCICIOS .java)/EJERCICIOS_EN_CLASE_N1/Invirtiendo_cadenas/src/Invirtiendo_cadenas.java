public class Invirtiendo_cadenas {

    public static String invertirCadena(String cadena) {
        // Convertimos la cadena a un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();

        // Invertimos el arreglo de caracteres
        int izquierda = 0;
        int derecha = caracteres.length - 1;

        while (izquierda < derecha) {
            // Intercambiamos los caracteres
            char temp = caracteres[izquierda];
            caracteres[izquierda] = caracteres[derecha];
            caracteres[derecha] = temp;

            // Movemos los índices
            izquierda++;
            derecha--;
        }

        // Convertimos el arreglo de caracteres de nuevo a una cadena
        return new String(caracteres);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String texto = "Hola mundo";
        String textoInvertido = invertirCadena(texto);

        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena invertida: " + textoInvertido);
    }
}