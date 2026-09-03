package Laboratorio1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        EcuacionLineal ecu1 = new EcuacionLineal(a, b, c);

        if (ecu1.getDiscriminante() > 0) {
            System.out.println("La ecuacion tiene dos raices " + String.format("%6f", ecu1.getRaiz1()) + " y " + String.format("%6f", ecu1.getRaiz2()));
        } else if (ecu1.getDiscriminante() == 0) {
            System.out.println("La ecuacion tiene una raiz " + ecu1.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }

        input.close();
    }
}
