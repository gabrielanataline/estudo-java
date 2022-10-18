package Aulas.poo;

public class PessoaTeste {
    //intuito, testar o uso da classe Pessoa
    public static void main(String[] args) {
        // new => contrói um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa ();  //criação do objeto Pessoa
        pessoa1.nome = "José";
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 28;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa ();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa ("Gabriela", "Nataline", 28, 1.74, 74);

        Pessoa recemNascido = new Pessoa ("Enzo", "Pereira");
        System.out.println(recemNascido.altura);


        //chamanado método
        recemNascido.dizOla();
        pessoa4.dizOla();

        pessoa4.mostrarImc();

        double imcPessoa4 = pessoa4.calcularImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("batata");


        Pessoa pedro = new Pessoa ("Pedro", "Carlos", 28, 1.75, 74);
        Pessoa joao = new Pessoa("João", "Carlos", 24, 1.67, 67);





    }
}
