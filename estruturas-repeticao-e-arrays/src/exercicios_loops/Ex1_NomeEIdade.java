package exercicios_loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {
    public static void main(String[] args) throws Exception {
        String nomeAluno;
        int idadeAluno;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("digite o nome do aluno: ");
            nomeAluno = sc.next();
            if (nomeAluno.equals("0")) break;
            System.out.println("digite a idade: ");
            idadeAluno = sc.nextInt();
        }
    }
}
