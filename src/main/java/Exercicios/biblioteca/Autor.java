package Exercicios.biblioteca;

public class Autor {
    private String nome;
    private String email;

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Livro escreverLivro (String nome, double preco){
        Livro novoLivro = new Livro (nome, this,preco);
        return novoLivro;
    }

    public String getNome (){
        return this.nome;
    }

    // Setter, sempre void e tem parametro!
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
