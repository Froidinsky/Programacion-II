package Laboratorio1.Ejercicio4;

public class Estadistica {
    private double[] valores;

    public Estadistica(double[] valores) {
        this.valores = valores;
    }

    public double promedio() {
        double promedio = 0;
        for (int i = 0; i < valores.length; i++) {
            promedio = promedio + valores[i];
        }
        return promedio / valores.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        int n = valores.length;

        for (double num : valores) {
            sumaCuadrados = sumaCuadrados + Math.pow(num - prom, 2);
        }

        return Math.sqrt(sumaCuadrados / (n - 1));
    }
}
