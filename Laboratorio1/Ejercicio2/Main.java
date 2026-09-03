package Laboratorio1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        EcuacionLineal ecu1 = new EcuacionLineal(a, b, c, d, e, f);

        if (ecu1.tieneSolucion()) {
            System.out.println("x = " + ecu1.getX() + ", y = " + ecu1.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }

        input.close();
    }
}
