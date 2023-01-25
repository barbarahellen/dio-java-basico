package aulaDois;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("exercício quadrilátero");

        // quadrado
        Quadrilatero.area(3);

        // retângulo
        Quadrilatero.area(5d, 5d);

        // trapézio
        Quadrilatero.area(7, 8, 9);

        // losango
        Quadrilatero.area(5f, 5f);
    }
}
