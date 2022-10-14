package Aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        //Lista não aceita tipos premitivos
        ArrayList<Integer> numeros = new ArrayList<>();  //Lista de números
        ArrayList<String> nomes = new ArrayList<>();  //Lista de String

        numeros.add(10);   //adicionando valor a lista
        numeros.add(100);
        numeros.add(1000);


        System.out.println(numeros.get(2)); // get, acessando elemento no ArrayList
        numeros.set(0, 500); //alterando valor da lista

        numeros.remove(0); // remove o elemento na posição o

        numeros.add(1,200); //add novo valor a posição 1

        System.out.println(numeros.size()); //saber o tamanho da lista

        for(int i =0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        for (int numero : numeros){    //para cada valor dentro do array, ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); // contains, verificar se tem o valor na lista, retorna true ou false
        System.out.println(numeros.indexOf(1000)); // saber se existe e saber a posição que está \
        // indexOf se não tiver o elemento, ele retorna -1
        System.out.println(numeros.lastIndexOf(200));// saber se existe o numero e qual posicao / da direita para a esqueda
    }
}
