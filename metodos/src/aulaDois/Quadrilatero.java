package aulaDois;
/*
  Calcule a área do quadrado, retângulo, trapezio e losango
  Utilize sobrecarga.
 */
public class Quadrilatero {
    public static void area(double lado){
        System.out.println("a área do quadrado é = " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("área do retângulo = " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("área do trapézio = " + (baseMaior + baseMenor) * altura / 2);
    }

    public static void area(float diagonal1, float diagonal2){
        System.out.println("área do losango = " + (diagonal1 + diagonal2) / 2);
    }

}
