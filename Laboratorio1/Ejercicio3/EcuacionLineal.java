package Laboratorio1.Ejercicio3;

public class EcuacionLineal {
    private double a;
    private double b;
    private double c;

    public EcuacionLineal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        double potencia = Math.pow(b, 2);
        return potencia - 4*a*c;
    }

    public double getRaiz1(){
        double potencia = Math.pow(b, 2);
        double raiz = Math.sqrt(potencia - 4*a*c);
        return (-b + raiz) / 2*a;
    }

    public double getRaiz2(){
        double potencia = Math.pow(b, 2);
        double raiz = Math.sqrt(potencia - 4*a*c);
        return (-b - raiz) / 2*a;
    }
}
