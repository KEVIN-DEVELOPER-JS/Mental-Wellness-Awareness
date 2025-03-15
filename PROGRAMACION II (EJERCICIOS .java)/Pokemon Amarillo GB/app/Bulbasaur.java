public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(int numPokedex, String nombrePokemon, double pesoPokemon,
                     String sexo, int temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Planta");
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

    // Implementar métodos de la interface IPlanta
    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Látigo Cepa");
    }
}