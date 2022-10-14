package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //para usar programa utilizando PONTO

        System.out.println(" 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
        System.out.println("Digite uma opção (1 a 4):");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = entrada.nextDouble();

        switch (opcao){     //switch case em versão melhorada
            case 1 -> {
                double soma = valor1+valor2;
                System.out.println("O resultado da soma é "+ soma);
            }
            case 2 -> {
                System.out.println("O reusltado da subtração é "+(valor1-valor2));
            }
            case 3 -> {
                System.out.println("O valor da multiplicação é "+(valor1*valor2));
            }
            case 4 -> {
                System.out.println("O valor da divisão é "+(valor1+valor2));
            }
            default -> {
                System.out.println("Você digitou uma operação inválida");
            }
        }
    }
}
