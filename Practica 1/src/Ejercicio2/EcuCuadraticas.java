package Ejercicio2;

public class EcuCuadraticas {
    private float a;
    private float b;
    private float c;
    public EcuCuadraticas(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDiscriminante(){
        return (float) Math.pow(b,2) - 4 * a * c;
    }
    public float getRaiz1(float disc){
        return (float)(-this.b + Math.sqrt(getDiscriminante())) / (2 * a);
    }
    public float getRaiz2(float disc){
        return (float)(-this.b - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    @Override
    public String toString(){
        float disc = getDiscriminante();
        if (disc > 0 ){
            return String.format("La ecuación tiene dos raíces %.6f y %.5f",getRaiz1(disc),getRaiz2(disc));
        }
        if (disc == 0 ){
            return String.format("La ecuación tiene una raíz %.0f",getRaiz1(disc));
        }
        else {
            return "La ecuación no tiene raíces reales";
        }
    }
}
