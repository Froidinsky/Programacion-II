package Laboratorio3.Ejercicio2;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void reiniciaParida() {
        record = 0;
    }

    public void actualizaRecord() {
        record = record + 1;
    }

    public boolean quitaVida() {
        if (numeroDeVidas > 0) {
            return true;
        } else {
            return false;
        }
    }
}