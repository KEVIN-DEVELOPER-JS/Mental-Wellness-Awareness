public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(int numPokedex, String nombrePokemon, double pesoPokemon,
                   String sexo, int temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Eléctrico");
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

    // Implementar métodos de la interface IElectrico
    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Rayo Carga");
    }
}
