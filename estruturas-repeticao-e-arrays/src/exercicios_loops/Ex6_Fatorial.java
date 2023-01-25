package exercicios_loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 ex: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("fatorial: ");
        int fatorial = sc.nextInt();
        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
