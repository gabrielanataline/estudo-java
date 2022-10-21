package Exercicios.biblioteca;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro (String nome,Autor autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main (String []args){
        Autor jk = new Autor("JK", "dsdsd@gmail.com");
        Livro pedraFilosofal = new Livro ("Harry Potter", jk, 24.9);
        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());
        System.out.println(pedraFilosofal.nome);
        System.out.println(pedraFilosofal.preco);

        Livro camarasecreta = jk.escreverLivro("Happy Potter e a Caâmara Secreta", 30);
    }

}
