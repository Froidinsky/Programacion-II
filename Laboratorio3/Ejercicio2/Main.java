package Laboratorio3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero jugador1 = new JuegoAdivinaNumero(1, 11);
        JuegoAdivinaNumero jugador2 = new JuegoAdivinaNumero(2, 3);
        JuegoAdivinaNumero jugador3 = new JuegoAdivinaNumero(3, 4);
        JuegoAdivinaPar jugador4 = new JuegoAdivinaPar(3, 6);
        JuegoAdivinaImpar jugador5 = new JuegoAdivinaImpar(3, 9);

        System.out.println("Juego adivina numero: ");
        System.out.println("Iniciando...");

        System.out.println("Jugador 1 jugando...");
        jugador1.juega();
        System.out.println("");

        System.out.println("Jugador 2 jugando...");
        jugador2.juega();
        System.out.println("");

        System.out.println("Jugador 3 jugando...");
        jugador3.juega();
        System.out.println("");

        System.out.println("Juego adivina numero par: ");
        System.out.println("Iniciando...");

        System.out.println("Jugador 4 jugando...");
        jugador4.juega();
        System.out.println("");

        System.out.println("Juego adivina numero impar: ");
        System.out.println("Iniciando...");

        System.out.println("Jugador 5 jugando...");
        jugador5.juega();
        System.out.println("");
    }
}