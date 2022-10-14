package Aulas;

public class Variaveis {

    //Execução do nosso programa Java
    public static void main (String[]args){
        System.out.println("Hello World");

        //Variáveis no Java
        int idade = 20; //inteiro
        double salario = 4500.99; //números decimais
        float nota = 7.5f; //sufixo F para float
        long populacaoTerra = 7_900_000_000l; //L para informar que é long
        boolean tarefaConcluida = false;
        int i = 1, j=0, k=1000;//multiplas variaveis
        String nomeCompleto = "José Almir";

        int teste = 10;
        teste = 9;

        final int teste2 = 200; // utilizando final, é impossivel mudar o valor da variavel

        //Operadores matematicos
        int a = 10;
        int b = 5;
        int soma = a+ b;
        int subtracao = a- b;
        int multiplicacao = a* b;
        int divisao = a/b;
        System.out.println("O resultado da soma é " +soma);
        //Divisão
        double sete = 7;
        double dois = 2;
        System.out.println(sete/dois);
        // double resultado3 = sete / (double) dois; converter int para double

        //Math
        double x = Math.sqrt(144); //raiz quadrada
        double v = Math.pow(5,2); // potênciação
        System.out.println(Math.PI);
        //CASTING, converte o valor da variável - pi é double e quero que seja int
        int pi2 = (int) Math.PI; //converter double para int
        System.out.println(pi2);


        //Operadores 2
        int valor = 5;
        valor++; //incremento
        valor--; //decremento
        valor +=10; //valor = valor+10

        //Operadores relacionais
        boolean teste1 = 5>1; //true
        boolean teste7 = 5<1; //false
        boolean teste3 = 5==5; //true
        boolean teste4 = 5!=1;//true
        boolean teste5 = 6>=6;//true
        boolean teste6 =5<=9; //true

        //Operadores lógicos
        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5>10) && (10<5); //false
        boolean teste11 = (10>=0) || (1<5); //true
        boolean teste12 =(5>1); //true
        boolean teste13 = !teste12; //false










    }
}
