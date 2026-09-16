package Laboratorio2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        MiPunto punto1 = new MiPunto();
        MiPunto punto2 = new MiPunto(10, 30.5);

        System.out.println("La distancia entre los puntos es: " + punto1.distancia(punto2));

        System.out.println("La distancia entre los puntos es: " + punto1.distancia(10, 30.5));
    }
}
