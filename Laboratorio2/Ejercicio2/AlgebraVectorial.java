package Laboratorio2.Ejercicio2;

public class AlgebraVectorial {
    private double a;
    private double b;
    private double[] vector = new double[2];
    private int indice = 0;

    public AlgebraVectorial() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public AlgebraVectorial(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double[] getVector() {
        return vector;
    }

    public void agregarVector(double valor) {
        if (this.indice < this.vector.length) {
            this.vector[this.indice] = valor;
            this.indice++;
        } else {
            System.out.println("Cantidad invalida");
        }
    }

    public double norma(double a, double b) {
        return Math.sqrt((a*a) + (b*b));
    }

    // inciso a
    public boolean esPerpendicular(AlgebraVectorial b) {
        double sumaA = this.a + b.getA();
        double sumaB = this.b + b.getB();
        double restaA = this.a - b.getA();
        double restaB = this.b - b.getB();
        double normaSuma = norma(sumaA, sumaB);
        double normaResta = norma(restaA, restaB);
        return normaSuma == normaResta;
    }

    // inciso b
    public boolean esPerpendicular(double a, double b) {
        double resta1A = this.a - a;
        double resta1B = this.b - b;
        double resta2A = a - this.a;
        double resta2B = b - this.b;
        return norma(resta1A, resta1B) == norma(resta2A, resta2B);
    }

    // inciso c
    public boolean esPerpendicular(AlgebraVectorial[] valoresVector) {
        if (valoresVector == null || valoresVector.length != 2) {
            return false;
        }
        double resultado1 = this.a * valoresVector[0].getA();
        double resultado2 = this.b * valoresVector[1].getB();
        return resultado1 + resultado2 == 0;
    }

    // inciso d
    public boolean esPerpendicular(AlgebraVectorial a, double b) {
        double vectorA = Math.pow(this.a, 2) + Math.pow(this.b, 2);
        double vectorB = Math.pow(a.getA(), 2) + Math.pow(b, 2);
        double resultadoAB = vectorA + vectorB;
        double normalVectorA = this.a + a.getA();
        double normalVectorB = this.b + b;
        double normalResultadoAB = Math.pow(normalVectorA, 2) + Math.pow(normalVectorB, 2);
        return normalResultadoAB == resultadoAB;
    }

    // inciso e
    public boolean esParalela(AlgebraVectorial otroVector) {
        if (otroVector.getA() != 0 && otroVector.getB() != 0) {
            double resultadoA = this.a / otroVector.getA();
            double resultadoB = this.b / otroVector.getB();
            return resultadoA == resultadoB;
        } else {
            System.out.println("No se puede dividir entre 0");
            return false;
        }
    }

    // inciso f
    public boolean esParalela(double a, double b) {
        double resultado1 = this.a * b;
        double resultado2 = this.b * a;
        return resultado1 - resultado2 == 0;
    }

    // inciso g
    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double productoPunto = (this.a * b.getA()) + (this.b * b.getB());
        double moduloCuadrado = Math.pow(b.getA(), 2) + Math.pow(b.getB(), 2);
        double escalar = productoPunto / moduloCuadrado;
        return new AlgebraVectorial(escalar * b.getA(), escalar * b.getB());
    }

    // inciso h
    public double componente(AlgebraVectorial b) {
        double productoPunto = (this.a * b.getA()) + (this.b * b.getB());
        double moduloB = norma(b.getA(), b.getB());
        if (moduloB == 0) {
            System.out.println("El modulo del vector no puede ser cero");
            return 0.0;
        }
        return productoPunto / moduloB;
    }
}
