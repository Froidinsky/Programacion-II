package Laboratorio1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] valores =  new double[10];

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = input.nextDouble();
        }

        Estadistica estadistica = new Estadistica(valores);

        System.out.println("El promedio es " + String.format("%.2f",estadistica.promedio()));
        System.out.println("La desviacion estandar es " + String.format("%.5f",estadistica.desviacion()));

        input.close();
    }
}
