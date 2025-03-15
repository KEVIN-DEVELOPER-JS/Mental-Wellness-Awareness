import java.util.Scanner;


public class PokemonBattle {
    private final Pokemon pokemonJugador;
    private final Pokemon pokemonRival;
    private final String nombreEntrenadorJugador;
    private final String nombreEntrenadorRival;
    private boolean turnoJugador;
    private boolean batallaContinua;

    public PokemonBattle(Pokemon pokemonJugador, Pokemon pokemonRival, String nombreEntrenadorJugador, String nombreEntrenadorRival) {
        this.pokemonJugador = pokemonJugador;
        this.pokemonRival = pokemonRival;
        this.nombreEntrenadorJugador = nombreEntrenadorJugador;
        this.nombreEntrenadorRival = nombreEntrenadorRival;
        this.turnoJugador = true;
        this.batallaContinua = true;
    }

    public void mostrarDialogo(String texto) {
        System.out.println("\n┌────────────────────────────────────┐");
        int maxCaracteresPorLinea = 34;
        for (int i = 0; i < texto.length(); i += maxCaracteresPorLinea) {
            int fin = Math.min(i + maxCaracteresPorLinea, texto.length());
            System.out.println("│ " + texto.substring(i, fin) + " ".repeat(maxCaracteresPorLinea - (fin - i)) + "│");
        }
        System.out.println("└────────────────────────────────────┘");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n┌────────────────────────────────────┐");
        System.out.println("│             ESTADÍSTICAS           │");
        System.out.println("├────────────────────────────────────┤");
        System.out.println("│ " + pokemonJugador.getNombrePokemon() + " ".repeat(34 - pokemonJugador.getNombrePokemon().length()) + "│");
        System.out.println("│ PS: " + pokemonJugador.getHp() + "/" + pokemonJugador.getMaxHp() + " ".repeat(30 - (String.valueOf(pokemonJugador.getHp()).length() + String.valueOf(pokemonJugador.getMaxHp()).length())) + "│");
        System.out.println("├────────────────────────────────────┤");
        System.out.println("│ " + pokemonRival.getNombrePokemon() + " ".repeat(34 - pokemonRival.getNombrePokemon().length()) + "│");
        System.out.println("│ PS: " + pokemonRival.getHp() + "/" + pokemonRival.getMaxHp() + " ".repeat(30 - (String.valueOf(pokemonRival.getHp()).length() + String.valueOf(pokemonRival.getMaxHp()).length())) + "│");
        System.out.println("└────────────────────────────────────┘");
    }

    public void mostrarMenuAtaques() {
        System.out.println("\n┌────────────────────────────────────┐");
        System.out.println("│ ¿Qué debería hacer " + pokemonJugador.getNombrePokemon() + "?    │");
        System.out.println("├────────────────────────────────────┤");
        System.out.println("│ 1. Atacar                          │");
        System.out.println("│ 2. Objetos                         │");
        System.out.println("│ 3. POKÉMON                         │");
        System.out.println("│ 4. Huir                            │");
        System.out.println("└────────────────────────────────────┘");
    }

    public void mostrarAtaquesDisponibles() {
        System.out.println("\n┌────────────────────────────────────┐");
        System.out.println("│ ATAQUES:                           │");
        System.out.println("│ 1. Placaje                         │");
        System.out.println("│ 2. Arañazo                         │");
        System.out.println("│ 3. Mordisco                        │");
        if (pokemonJugador instanceof IFuego) {
            System.out.println("│ 4. Ascuas                          │");
            System.out.println("│ 5. Lanzallamas                     │");
        } else if (pokemonJugador instanceof IAgua) {
            System.out.println("│ 4. Pistola Agua                    │");
            System.out.println("│ 5. Hidropulso                      │");
        } else if (pokemonJugador instanceof IPlanta) {
            System.out.println("│ 4. Hoja Afilada                    │");
            System.out.println("│ 5. Látigo Cepa                     │");
        } else if (pokemonJugador instanceof IElectrico) {
            System.out.println("│ 4. Impactrueno                     │");
            System.out.println("│ 5. Rayo                            │");
        }
        System.out.println("└────────────────────────────────────┘");
    }

    public void realizarAtaque(int opcionAtaque) {
        int daño = 0;
        switch (opcionAtaque) {
            case 1:
                daño = 15;
                break;
            case 2:
                daño = 20;
                break;
            case 3:
                daño = 25;
                break;
            case 4:
                if (pokemonJugador instanceof IFuego) {
                    daño = 30;
                } else if (pokemonJugador instanceof IAgua) {
                    daño = 30;
                } else if (pokemonJugador instanceof IPlanta) {
                    daño = 30;
                } else if (pokemonJugador instanceof IElectrico) {
                    daño = 30;
                }
                break;
            case 5:
                if (pokemonJugador instanceof IFuego) {
                    daño = 40;
                } else if (pokemonJugador instanceof IAgua) {
                    daño = 40;
                } else if (pokemonJugador instanceof IPlanta) {
                    daño = 40;
                } else if (pokemonJugador instanceof IElectrico) {
                    daño = 40;
                }
                break;
        }
        daño = calcularVentajaDesventaja(pokemonJugador.getTipo(), pokemonRival.getTipo(), daño);
        pokemonRival.recibirDanio(daño);
        if (daño > 35) {
            mostrarDialogo("¡Es super efectivo!");
        } else if (daño < 15) {
            mostrarDialogo("No es muy efectivo...");
        }
        if (pokemonRival.getHp() <= 0) {
            pokemonRival.setHp(0);
            batallaContinua = false;
            mostrarDialogo(pokemonRival.getNombrePokemon() + " enemigo se debilitó!");
            mostrarDialogo(nombreEntrenadorJugador + " ganó la batalla!");
        } else {
            turnoJugador = false;
        }
    }

    public void turnoRival() {
        mostrarDialogo("El " + pokemonRival.getNombrePokemon() + " enemigo está pensando...");
        int opcionAtaque = (int) (Math.random() * 5) + 1;
        int daño = 0;
        switch (opcionAtaque) {
            case 1:
                daño = 15;
                break;
            case 2:
                daño = 20;
                break;
            case 3:
                daño = 25;
                break;
            case 4:
            case 5:
                if (pokemonRival instanceof IFuego || pokemonRival instanceof IAgua || pokemonRival instanceof IPlanta || pokemonRival instanceof IElectrico) {
                    daño = opcionAtaque == 4 ? 30 : 40;
                }
                break;
        }
        daño = calcularVentajaDesventaja(pokemonRival.getTipo(), pokemonJugador.getTipo(), daño);
        pokemonJugador.recibirDanio(daño);
        if (daño > 35) {
            mostrarDialogo("¡Es super efectivo!");
        } else if (daño < 15) {
            mostrarDialogo("No es muy efectivo...");
        }
        if (pokemonJugador.getHp() <= 0) {
            pokemonJugador.setHp(0);
            batallaContinua = false;
            mostrarDialogo(pokemonJugador.getNombrePokemon() + " se debilitó!");
            mostrarDialogo(nombreEntrenadorJugador + " perdió contra " + nombreEntrenadorRival + "!");
        } else {
            turnoJugador = true;
        }
    }

    private int calcularVentajaDesventaja(String tipoAtacante, String tipoDefensor, int daño) {
        if (tipoAtacante.equals("Fuego") && tipoDefensor.equals("Planta") || tipoAtacante.equals("Agua") && tipoDefensor.equals("Fuego") || tipoAtacante.equals("Planta") && tipoDefensor.equals("Agua") || tipoAtacante.equals("Eléctrico") && tipoDefensor.equals("Agua")) {
            return (int) (daño * 1.5);
        } else if (tipoAtacante.equals("Fuego") && tipoDefensor.equals("Agua") || tipoAtacante.equals("Agua") && tipoDefensor.equals("Planta") || tipoAtacante.equals("Planta") && tipoDefensor.equals("Fuego")) {
            return (int) (daño * 0.5);
        }
        return daño;
    }

    @SuppressWarnings("BusyWait")
    public void iniciarBatalla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n╔══════════════════════════════════════╗");
        System.out.println("║                                      ║");
        System.out.println("║         ¡BATALLA POKÉMON!            ║");
        System.out.println("║                                      ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
        mostrarDialogo(nombreEntrenadorRival + " te desafía a una batalla!");
        mostrarDialogo(nombreEntrenadorRival + " envía a " + pokemonRival.getNombrePokemon() + "!");
        mostrarDialogo("¡Adelante " + pokemonJugador.getNombrePokemon() + "!");
        while (batallaContinua) {
            mostrarEstadisticas();
            if (turnoJugador) {
                mostrarMenuAtaques();
                System.out.print("Ingrese su elección (1-4): ");
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    mostrarAtaquesDisponibles();
                    System.out.print("Seleccione un ataque (1-5): ");
                    int ataqueElegido = scanner.nextInt();
                    realizarAtaque(ataqueElegido);
                } else if (opcion == 2) {
                    mostrarDialogo("No tienes objetos disponibles.");
                    continue;
                } else if (opcion == 3) {
                    mostrarDialogo("No tienes más POKÉMONs disponibles.");
                    continue;
                } else if (opcion == 4) {
                    mostrarDialogo("No puedes huir de una batalla con entrenador!");
                    continue;
                }
            } else {
                turnoRival();
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}