package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho:");
        int tamanho = entrada.nextInt();

        int [] v1 = new int [tamanho];   //vetor terá o tamanho especificado pelo usuário
        int [] v2 = new int [tamanho];

        System.out.println("Digite os valores de v1:");
        for (int i = 0; i < tamanho; i++){
            v1 [i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2:");
        for (int i = 0; i < tamanho; i++){
            v2 [i] = entrada.nextInt();
        }


        int encontros = 0;

        for (int i = 0; i < tamanho; i++){
            if (v1[i] == v2[i]){
                encontros++;
            }
        }

        System.out.println("Foram "+encontros+" encontro(s)!");



    }
}
