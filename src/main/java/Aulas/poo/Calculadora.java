package Aulas.poo;

public class Calculadora {

    //Atributo estático
    public static final double PI = 3.14;  // Final => impede valor ser alterado

    //Método estático
    //Não pertence ao objeto, mas sim a classe
    // Chamo => a classe.método()
    public static double soma (double a, double b){
        return a + b;
    }
    public static double subtracao(double a, double b){
        return a - b;
    }
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    public static double divisao(double a, double b){
        return a * b;
    }

    public static void main (String []args){
        double resultadoSoma = Calculadora.soma(1,2);
        double resultadosub = Calculadora.subtracao(1,2);
        double resultadoMult = Calculadora.multiplicacao(1,2);
        double resultadoDiv = Calculadora.divisao(1,2);
    }




}
