public class Charmander extends Pokemon implements IFuego {

    public Charmander(int numPokedex, String nombrePokemon, double pesoPokemon,
                      String sexo, int temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Fuego");
    }

    // Sobrescribir métodos de ataques comunes
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Mordisco");
    }

    // Implementar métodos de la interface IFuego
    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Lanzallamas");
    }
}