 public abstract class Pokemon {
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    // Atributos para batalla
    protected int hp;
    protected int maxHp;
    protected int nivel;

    // Constructor
    public Pokemon(int numPokedex, String nombrePokemon, double pesoPokemon,
                   String sexo, int temporadaQueAparece, String tipo) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;

        // Inicializar atributos de batalla
        this.nivel = 5;
        this.maxHp = 20 + (nivel * 5); // Fórmula simple para calcular HP
        this.hp = this.maxHp;
    }

    // Métodos para ataques comunes
    public void atacarPlacaje() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Placaje");
    }

    public void atacarArañazo() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Arañazo");
    }

    public void atacarMordisco() {
        System.out.println("Soy " + this.nombrePokemon + " y estoy atacando con Mordisco");
    }

    // Método para recibir daño
    public void recibirDanio(int cantidad) {
        this.hp = Math.max(0, this.hp - cantidad);
    }

     public String getNombrePokemon() {
        return nombrePokemon;
    }

     public String getTipo() {
        return tipo;
    }

     public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

     public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}