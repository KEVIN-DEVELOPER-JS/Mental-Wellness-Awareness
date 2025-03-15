import java.util.Scanner;

public class PokemonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bienvenida
        System.out.println("¡Bienvenido al mundo Pokémon!");
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();

        // Mostrar opciones de Pokémon inicial
        System.out.println("\nProfesor Oak: ¡Hola " + nombreJugador + "! Es hora de elegir tu primer Pokémon.");
        System.out.println("1. Charmander (Tipo Fuego)");
        System.out.println("2. Bulbasaur (Tipo Planta)");
        System.out.println("3. Squirtle (Tipo Agua)");
        System.out.println("4. Pikachu (Tipo Eléctrico)");
        System.out.print("Elige tu Pokémon (1-4): ");

        int eleccion = scanner.nextInt();
        Pokemon pokemonJugador = switch (eleccion) {
            case 1 -> new Charmander(4, "Charmander", 8.5, "Macho", 1);
            case 2 -> new Bulbasaur(1, "Bulbasaur", 6.9, "Macho", 1);
            case 3 -> new Squirtle(7, "Squirtle", 9.0, "Macho", 1);
            case 4 -> new Pikachu(25, "Pikachu", 6.0, "Macho", 1);
            default -> {
                System.out.println("Opción no válida. Te asignaremos a Pikachu.");
                yield new Pikachu(25, "Pikachu", 6.0, "Macho", 1);
            }
        };

        // Crear el Pokémon elegido por el jugador

        System.out.println("\nProfesor Oak: ¡Excelente elección! " + pokemonJugador.getNombrePokemon() + " será tu compañero.");
        System.out.println("Profesor Oak: Tu rival Gary también ha elegido su Pokémon. ¡Prepárate para tu primera batalla!");

        // Crear un Pokémon para el rival (elegir uno con ventaja de tipo contra el jugador)
        Pokemon pokemonRival = null;
        switch (pokemonJugador) {
            case Charmander _ -> pokemonRival = new Squirtle(7, "Squirtle", 9.0, "Macho", 1);
            case Bulbasaur _ -> pokemonRival = new Charmander(4, "Charmander", 8.5, "Macho", 1);
            case Squirtle _, Pikachu _ -> pokemonRival = new Bulbasaur(1, "Bulbasaur", 6.9, "Macho", 1);
            default -> {
            }
        }

        // Establecer niveles
        pokemonJugador.setNivel(5);
        pokemonRival.setNivel(5);

        // Crear y comenzar la batalla
        PokemonBattle batalla = new PokemonBattle(pokemonJugador, pokemonRival, nombreJugador, "Gary");
        batalla.iniciarBatalla();

        // Mensaje de despedida
        System.out.println("\nGracias por jugar a la simulación de batalla Pokémon!");
    }
}