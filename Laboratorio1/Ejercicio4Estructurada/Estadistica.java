package Laboratorio1.Ejercicio4Estructurada;

import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] valores = new double[10];
        double suma = 0;
        double promedio = 0;
        double sumaCuadrados = 0;
        double desviacion = 0;

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = input.nextDouble();
        }

        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i];
        }

        promedio = suma / valores.length;

        for (int i = 0; i < valores.length; i++) {
            sumaCuadrados = sumaCuadrados + Math.pow(valores[i] - promedio, 2);
        }

        desviacion = Math.sqrt(sumaCuadrados / ((valores.length) - 1));

        System.out.println("El promedio es " + String.format("%.2f", promedio));
        System.out.println("La desviacion estandar es " + String.format("%.5f", desviacion));

        input.close();
    }
}
