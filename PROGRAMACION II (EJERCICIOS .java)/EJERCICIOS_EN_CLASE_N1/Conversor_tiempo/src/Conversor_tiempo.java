public class Conversor_tiempo {

    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        // Definimos las constantes de conversión
        final long MILISEGUNDOS_POR_SEGUNDO = 1000;
        final long SEGUNDOS_POR_MINUTO = 60;
        final long MINUTOS_POR_HORA = 60;
        final long HORAS_POR_DIA = 24;

        // Convertimos todo a milisegundos
        long milisegundos = dias * HORAS_POR_DIA * MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO * MILISEGUNDOS_POR_SEGUNDO;
        milisegundos += horas * MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO * MILISEGUNDOS_POR_SEGUNDO;
        milisegundos += minutos * SEGUNDOS_POR_MINUTO * MILISEGUNDOS_POR_SEGUNDO;
        milisegundos += segundos * MILISEGUNDOS_POR_SEGUNDO;

        return milisegundos;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int dias = 2;
        int horas = 3;
        int minutos = 30;
        int segundos = 45;

        long resultado = convertirAMilisegundos(dias, horas, minutos, segundos);
        System.out.println("El resultado en milisegundos es: " + resultado);
    }
}