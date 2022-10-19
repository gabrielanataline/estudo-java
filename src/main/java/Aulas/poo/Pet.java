package Aulas.poo;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

//  SUPER CLASSE
public class Pet {
    private String nome;    //propriedades//atributos
    private int idade;
    protected double peso;
    // protected => permite acesso direto nas subclasses

    public Pet (String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    public void fazerSom(){
        System.out.println("....");
    }
    public void comer(String comida){
        System.out.println("Estou comendo "+comida);
    }
    public void dormir(){
        System.out.println("zzzzzzz");
    }
    public void brincar (){
        System.out.println("Estou brincando..");
    }

    public double getPeso() {  //valor não pode ser modificado, apenas leitura
        return this.peso;
    }

    public void setPeso (double novoPeso){ //valor pode ser alterado para novoPeso  //sempre precisa de parametro
        this.peso = novoPeso;
    }
}
