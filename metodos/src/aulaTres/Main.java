package aulaTres;

public class Main {
    public static void main(String[] args) {
        System.out.println("exercício quadrilátero");

        // quadrado
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("área do quadrado = " + areaQuadrado);

        // retângulo
        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("área do retangulo = " +areaRetangulo);

        // trapézio
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("área do trapezio = " +areaTrapezio);

        // losango
        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("área do losango = " +areaLosango);
    }
}
