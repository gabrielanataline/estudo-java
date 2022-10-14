package Aulas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EstudosStrings {
    public static void main(String[] args) {
        //Strings, cadeia de caracteres
        // "José" > J = 0, O = 1, S = 2, E = 3 Cada letra, tem uma posição

        String nome = "Pedro";
        if(nome == "Pedro"){   // está verificando o local que está armazenado, e não o contéudo
            System.out.println("São iguais");
        }


        System.out.println("Digite seu sobrenome:");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("Pereira")){    //equals, compara o contéudo das strings
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        //sobrenome.equalsIgnoreCase("pereira") = ignora Maiscula ou minuscula;


        //Outros métodos, cortando String
        String java ="Java";
        String ja = java.substring(0,2);  //começa do 0 e pega até 1
        String va = java.substring(2); // pega da posição 2 até o final
        System.out.println(ja);
        System.out.println(va);


        //concatenar
        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se está vazia => ""
        System.out.println(java.toUpperCase()); // JAVA em CAIXA ALTA
        System.out.println(java.toLowerCase()); // java em caixa baixa


        // Exemplo
        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }



        //dividindo valores da String
        String data = "13/10/2022";
        String[] valores = data.split("/");  //split, divide os valores em arrays
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String [] valoresEmail = email.split("@"); //irá dividir a partir do @
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "Gabriela Nataline";
        String [] nomesSeparado = nome2.split(" ");
        System.out.println(nomesSeparado[0]);

        String teste = "Amanhã é sexta-feira";
        String [] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));  //mostrar o que tem dentro do array

        String cpf = "421.090.388.45";
        String [] cpf2 = cpf.split("\\.");
        System.out.println(Arrays.toString(cpf2));

    }
}
