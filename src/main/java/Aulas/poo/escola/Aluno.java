package Aulas.poo.escola;

public class Aluno extends Pessoa{

        private double media;

        public Aluno( String nome, String email, String cpf, double media){
            super(nome,email,cpf);   //estou referenciando o construtor da classe pessoa
            this.media = media;
        }

        @Override
        public void seApresentar(){
            super.seApresentar();
            System.out.println("Eu sou uma aluno com média "+this.media);
        }
        public double getMedia (){
            return this.media;
        }
}
