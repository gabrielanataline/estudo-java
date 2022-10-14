package Aulas;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in); //ler dados de usuarios no Java

        System.out.println("Qual seu nome?"); //mostrar mensagem
        String nome = entrada.nextLine(); //usuário vai digitar //nextLine - entrada de String


        System.out.println("Qual a sua idade");
        int idade = entrada.nextInt(); //nextInt - entrada de números inteiros

        System.out.println("Qual a sua altura em metros?");
        double altura = entrada.nextDouble();//nextDouble - entrada de números decimais

        System.out.println("Qual o seu peso (kg)?");
        double peso = entrada.nextDouble();

        double imc = peso/ Math.pow(altura,2);

        System.out.println("Olá, meu nome é "+nome+ " e minha idade é "+idade);
        System.out.printf("Olá meu nome é %s e tenho $d anos! \n", nome, idade);

        System.out.println("Seu imc é: "+imc);
        System.out.printf("Este é o seu IMC =%.2f \n",imc);

        if (imc<17){
            System.out.println("Muito abaixo do peso");
        }else if(imc>=17 && imc<19.49){
            System.out.println("Abaixo do peso");
        }else if (imc >=18.5 && imc <=24.99) {
            System.out.println("Peso normal");
        }else if (imc >=25 && imc <=29.99) {
            System.out.println("Acima do peso");
        }else if (imc >=30 && imc <=34.99){
            System.out.println("Obesidade 1");
        }else if (imc>=35 && imc <=39.99){
            System.out.println("Obesidade II (severa)");
        }else {
            System.out.println("Obesidade III");
        }


        //Swith-case, estrutura de seleção
        System.out.println("Selecine uma dieta (1 a 3)");
        System.out.println("1 - água");
        System.out.println("2 - fruta");
        System.out.println("3 - batata");
        int dieta = entrada.nextInt();

        switch (dieta){
            case 1:
                System.out.println("Você escolhou a dieta água");
                break; //impedir de testar as condições a baixo;
            case 2:
                System.out.println("Você escolheu a dieta da fruta");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata");
                break;
            default:
                System.out.println("Esta dieta não existe!");

        }

        // usando laço de repetição for
        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i=0; i<totalAlimentos; i++) {
            System.out.println(i);
        }


        // usando while
        int i = 0;
        while(i <totalAlimentos){
            System.out.println(i);
            i++;
        }
        System.out.println(i);
    }
}
