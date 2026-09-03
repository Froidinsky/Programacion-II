package Laboratorio1.Ejercicio1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int n = 100000;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = aleatorio.nextInt(n);
        }

        Cronometro cronometro = new Cronometro();
        cronometro.inicia();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temporal = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temporal;
        }

        cronometro.detener();
        System.out.println("tiempo de ejecucion: " + cronometro.lapsoDeTiempo() + " milisegundos");
    }
}
