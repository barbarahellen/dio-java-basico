package exercicios_arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    public static void main(String[] args) {

        String[] vetorConsoantes = new String[6];  // cria e inicializa o array
        int qtdConsoantes = 0;  //controlador para saber a quantidade de consoantes
        String letra;

        Scanner sc = new Scanner(System.in);

        int count = 0;

        do{
            System.out.println("letra: ");
            letra = sc.next();

            if(!(letra.equalsIgnoreCase("a")) | 
                (letra.equalsIgnoreCase("e")) | 
                (letra.equalsIgnoreCase("i")) | 
                (letra.equalsIgnoreCase("o")) | 
                (letra.equalsIgnoreCase("u"))){
                    vetorConsoantes[count] = letra;
                    qtdConsoantes++;
            } 
            count++;

        } while(count < vetorConsoantes.length);

        System.out.println("consoantes: ");
        for(String consoante : vetorConsoantes){
            if(vetorConsoantes != null)
                System.out.println(vetorConsoantes + " ");
        }
        System.out.println("quantidade de consoantes: "+ qtdConsoantes);
        System.out.println(vetorConsoantes.length);
    }
}
