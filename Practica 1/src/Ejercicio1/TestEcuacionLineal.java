package Ejercicio1;

import java.util.Scanner;

public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        EcuacionLineal sistema = new EcuacionLineal(a, b, c, d, e, f);

        if (sistema.tieneSolucion()) {
            double x = sistema.getX();
            double y = sistema.getY();
            System.out.printf("x =  " + x + " , y =  " + y);
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        scanner.close();
    }
}
