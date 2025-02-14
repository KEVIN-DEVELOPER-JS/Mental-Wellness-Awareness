import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Definiendo_funciones {

    // Función para elevar cada elemento de la lista a una potencia dada
    public static List<Double> listaPotencia(int potencia, List<Double> lista) {
        List<Double> resultado = new ArrayList<>();
        for (Double elemento : lista) {
            resultado.add(Math.pow(elemento, potencia));
        }
        return resultado;
    }

    // Función para multiplicar dos listas elemento por elemento
    public static List<Double> listasMultiplicacion(List<Double> lista1, List<Double> lista2) {
        List<Double> resultado = new ArrayList<>();
        if (lista1.size() != lista2.size()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }
        for (int i = 0; i < lista1.size(); i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }
        return resultado;
    }

    // Función para calcular el promedio de una lista
    public static double calcularPromedio(List<Double> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        double suma = 0;
        for (Double elemento : lista) {
            suma += elemento;
        }
        return suma / lista.size();
    }

    // Función para invertir una lista
    public static List<Double> invertirLista(List<Double> lista) {
        List<Double> resultado = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            resultado.add(lista.get(i));
        }
        return resultado;
    }

    // Función para eliminar duplicados de una lista
    public static List<Double> eliminarDuplicados(List<Double> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }

    // Función para verificar si una lista está ordenada de manera ascendente
    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // Función para combinar dos listas
    public static List<Integer> combinarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(lista1);
        resultado.addAll(lista2);
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        List<Double> lista = List.of(1.0, 2.0, 3.0);
        System.out.println("Lista original: " + lista);
        System.out.println("Lista al cuadrado: " + listaPotencia(2, lista));

        List<Double> lista1 = List.of(1.0, 2.0, 3.0);
        List<Double> lista2 = List.of(4.0, 5.0, 6.0);
        System.out.println("Multiplicación de listas: " + listasMultiplicacion(lista1, lista2));

        System.out.println("Promedio de la lista: " + calcularPromedio(lista));

        System.out.println("Lista invertida: " + invertirLista(lista));

        List<Double> listaConDuplicados = List.of(1.0, 2.0, 2.0, 3.0);
        System.out.println("Lista sin duplicados: " + eliminarDuplicados(listaConDuplicados));

        List<Integer> listaOrdenada = List.of(1, 2, 3, 4);
        List<Integer> listaNoOrdenada = List.of(1, 3, 2, 4);
        System.out.println("¿Está ordenada la lista? " + estaOrdenada(listaOrdenada));
        System.out.println("¿Está ordenada la lista? " + estaOrdenada(listaNoOrdenada));

        List<Integer> lista3 = List.of(1, 2, 3);
        List<Integer> lista4 = List.of(4, 5, 6);
        System.out.println("Listas combinadas: " + combinarListas(lista3, lista4));
    }
}