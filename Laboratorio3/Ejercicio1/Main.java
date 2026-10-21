package Laboratorio3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero jugador1 = new JuegoAdivinaNumero(1, 3);
        JuegoAdivinaNumero jugador2 = new JuegoAdivinaNumero(2, 3);
        JuegoAdivinaNumero jugador3 = new JuegoAdivinaNumero(3, 4);

        System.out.println("Jugador 1 jugando...");
        jugador1.juega();
        System.out.println("");

        System.out.println("Jugador 2 jugando...");
        jugador2.juega();
        System.out.println("");

        System.out.println("Jugador 3 jugando...");
        jugador3.juega();
        System.out.println("");
    }
}