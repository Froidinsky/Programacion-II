package Laboratorio2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        AlgebraVectorial vectorA = new AlgebraVectorial(3, 4);
        AlgebraVectorial vectorB = new AlgebraVectorial(8, 0);

        // inciso a
        System.out.println("Es perpendicular: " + vectorA.esPerpendicular(vectorB));

        // inciso b
        System.out.println("Es perpendicular: " + vectorA.esPerpendicular(8, 0));

        // inciso c
        vectorA.agregarVector(8);
        vectorA.agregarVector(0);

        AlgebraVectorial[] vectores = {vectorA};

        System.out.println("Es perpendicular: " + vectorA.esPerpendicular(vectores));

        // inciso d
        System.out.println("Es perpendicular: " + vectorA.esPerpendicular(vectorB, 0));

        // inciso e
        System.out.println("Es paralela: " + vectorA.esParalela(vectorB));

        // inciso f
        System.out.println("Es paralela: " + vectorA.esParalela(8, 0));

        // inciso g
        AlgebraVectorial proyeccion = vectorA.proyeccion(vectorB);
        System.out.println("Proyeccion: " + proyeccion.getA() + ", " + proyeccion.getB());

        // inciso h
        System.out.println("Componente: " + vectorA.componente(vectorB));
    }
}
