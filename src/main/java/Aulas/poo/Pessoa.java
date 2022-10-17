package Aulas.poo;

public class Pessoa {
    //Propriedades/atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;



    Pessoa (){ // construtor tem o nome da classe
        this.nome = "Jose";    // this => representa o objeto dentro da classe
        this.sobrenome = "Carlos";
        this.idade = 28;
        this.peso = 55.0;
        this.altura = 1.65;

    }
    Pessoa (String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura ;
        this.peso = peso;
    }

    Pessoa (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = 0.5 ;
        this.peso = 2.0;
    }

    //ações de uma pessoa (métodos)
    //método, esse método sempre estará dentro de uma class!
    // <tipo_retorno> nomedoMetodo(Parametros) {}
    void dizOla(){    //esse método irá executar algo, não retorna nada
        System.out.println("Olá, tudo bem? Meu nome ");
    }

    void mostrarImc(){
        double imc = this.peso / (this.altura*this.altura);
        System.out.println("O meu IMC é "+imc);
    }

    double calcularImc (){  //deve retornar um valor
        double imc = this.peso / (this.altura*this.altura);
        return imc;
    }

    void comer(String comida){
        System.out.println("Estou comendo "+comida);
        this.peso +=1.5;
    }
}
