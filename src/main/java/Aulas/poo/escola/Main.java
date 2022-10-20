package Aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno ("Carlos", "carlos@hotmail.com", "23324424234", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João", "joao@hotmail.com", "34234234234", "TI");

        Pessoa p1 = new Pessoa ("Maria", "maria@hotmail.com", "434543534534");
        p1.seApresentar();

        Pessoa p2 = new Aluno ("Carlos", "carlos@hotmail.com", "23324424234", 7.5);
        Pessoa prof2 = new Professor("João", "joao@hotmail.com", "34234234234", "TI");

        p2.seApresentar();
        prof2.seApresentar();

        //polimorfismo
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(prof2);

        for (Pessoa pessoa : pessoas){
            //método seApresentar se comporto diferente dependendo da classe original
            pessoa.seApresentar();

        }





    }
}
