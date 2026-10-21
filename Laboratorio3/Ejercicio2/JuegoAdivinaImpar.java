package Laboratorio3.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas, numeroAAdivinar);
    }

    @Override
    public boolean validaNumero(int numero) {
        if ((numero >= 0 && numero <= 10) && numero % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void juega(){
        if (validaNumero(numeroAAdivinar)) {
            Random aleatorio = new Random();
            Scanner num = new Scanner(System.in);
            int contador = numeroDeVidas;
            reiniciaParida();
            int numero = (aleatorio.nextInt(5) * 2) + 1;
            System.out.println("Adivine un numero del 0 al 10 en impar: ");
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
                        if (validaNumero(nuevo)) {
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
                        } else {
                            System.out.println("El numero debe estar en el rango de 0 a 10 y debe ser numero impar");
                            System.out.print("Intentelo de nuevo, elija un nuevo numero: ");
                            contador = contador - 1;
                        }
                    }
                    System.out.println("Ya no le quedan mas vidas");

                } else {
                    System.out.println("Ya no le quedan mas vidas");
                }
            }
        } else {
            System.out.println("El numero debe estar en el rango de 0 a 10 y debe ser numero impar");
        }
    }
}