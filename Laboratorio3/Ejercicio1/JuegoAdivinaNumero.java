package Laboratorio3.Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas);
        this.numeroAAdivinar = numeroAAdivinar;
    }

    public void juega(){
        Random aleatorio = new Random();
        Scanner num = new Scanner(System.in);
        int contador = numeroDeVidas;
        reiniciaParida();
        int numero = aleatorio.nextInt(11);
        System.out.println("Adivine un numero del 0 al 10: ");
        if  (numero == numeroAAdivinar) {
            System.out.println("Acertaste!! el numero es " + numero);
            actualizaRecord();
        } else {
            contador = contador - 1;
            if (quitaVida()) {
                if (numeroAAdivinar > numero) {
                    System.out.println("El numero a adivinar es menor que el numero " + numeroAAdivinar);
                } else  {
                    System.out.println("El numero a adivinar es mayor que el numero " + numeroAAdivinar);
                }
                System.out.print("Intentelo de nuevo, elija un nuevo numero: ");

                while (contador > 0) {
                    int nuevo = num.nextInt();
                    if (nuevo == numero) {
                        System.out.println("Acertaste!! el numero es " + numero);
                        actualizaRecord();
                        return;
                    } else {
                        contador = contador - 1;
                        if (nuevo > numero) {
                            System.out.println("El numero a adivinar es menor que el numero " + nuevo);
                            System.out.print("Intentelo de nuevo, elija un nuevo numero: ");
                        } else  {
                            System.out.println("El numero a adivinar es mayor que el numero " + nuevo);
                            System.out.print("Intentelo de nuevo, elija un nuevo numero: ");
                        }
                    }
                }
                System.out.println("Ya no le quedan mas vidas");

            } else {
                System.out.println("Ya no le quedan mas vidas");
            }
        }
    }
}