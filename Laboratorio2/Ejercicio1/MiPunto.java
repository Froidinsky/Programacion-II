package Laboratorio2.Ejercicio1;

public class MiPunto {
    private double x;
    private double y;

    public MiPunto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia (MiPunto otroPunto) {
        return Math.sqrt((Math.pow(this.x - otroPunto.getX(), 2)) + (Math.pow(this.y - otroPunto.getY(), 2)));
    }

    public double distancia(double x, double y) {
        return Math.sqrt((Math.pow(this.x - x, 2)) + (Math.pow(this.y - y, 2)));
    }
}
