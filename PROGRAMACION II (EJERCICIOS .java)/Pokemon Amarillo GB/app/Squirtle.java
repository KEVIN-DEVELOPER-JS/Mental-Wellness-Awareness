public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(int numPokedex, String nombrePokemon, double pesoPokemon,
                    String sexo, int temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Agua");
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

    // Implementar métodos de la interface IAgua
    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Hidropulso");
    }
}