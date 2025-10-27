import java.util.ArrayList;
import java.util.Random;

class Jugador {
    String nombre;
    int danio;

    Jugador(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }
}

public class refactorizacion2 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = getJugadores();

        while (jugadores.size() > 1) {
            ArrayList<Jugador> ganadores = new ArrayList<>();
            jugadores = enfrentamiento(jugadores, ganadores);
        }
        System.out.println("🏆 Ganador final: " + jugadores.get(0).nombre + " con un daño de " + jugadores.get(0).danio);
    }

    private static ArrayList<Jugador> enfrentamiento(ArrayList<Jugador> jugadores, ArrayList<Jugador> ganadores) {
        for (int i = 0; i < jugadores.size(); i += 2) {
            if (i + 1 >= jugadores.size()) {
                ganadores.add(jugadores.get(i));
                break;
            }
            getGanador(jugadores, ganadores, i);
        }
        jugadores = ganadores;
        System.out.println("---- Nueva ronda ----");
        return jugadores;
    }

    private static void getGanador(ArrayList<Jugador> jugadores, ArrayList<Jugador> ganadores, int i) {
        Jugador jugador1 = jugadores.get(i);
        Jugador jugador2 = jugadores.get(i + 1);
        Jugador ganador;
        System.out.println(jugador1.nombre + "(" + jugador1.danio + ") vs " + jugador2.nombre + "(" + jugador2.danio + ")");
        if (jugador1.danio > jugador2.danio) {
            ganador = jugador1;
        } else {
            ganador = jugador2;
        }
        ganadores.add(ganador);
        System.out.println("Ganador: " + ganador.nombre);
    }

    private static ArrayList<Jugador> getJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Pepe", new Random().nextInt(100)));
        jugadores.add(new Jugador("María", new Random().nextInt(100)));
        jugadores.add(new Jugador("Pedro", new Random().nextInt(100)));
        jugadores.add(new Jugador("Darío", new Random().nextInt(100)));
        jugadores.add(new Jugador("Enrique", new Random().nextInt(100)));
        jugadores.add(new Jugador("Pabro", new Random().nextInt(100)));
        jugadores.add(new Jugador("Gabriel", new Random().nextInt(100)));
        jugadores.add(new Jugador("Hugo", new Random().nextInt(100)));
        return jugadores;
    }
}
