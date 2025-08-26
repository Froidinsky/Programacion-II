package Ejercicio2;

import java.util.Scanner;

public class TestEcuCuadraticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        String[] input= sc.nextLine().split(" ");
        float a = Float.parseFloat(input[0]);
        float b = Float.parseFloat(input[1]);
        float c = Float.parseFloat(input[2]);

        EcuCuadraticas ec = new EcuCuadraticas(a,b,c);
        System.out.println(ec);
    }
}
