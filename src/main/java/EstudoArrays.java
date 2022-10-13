import java.util.Scanner;

public class EstudoArrays {
        //no java, o Array depois de criado não conseguimos adicionar mais campos
    public static void main(String[]args){
        int [] numeros = {4, 2, 3, 4, 5};

        System.out.println(numeros.length); //saber quantas posições tem o array
        numeros [3] = 1000; //mudando valor do array
        System.out.println(numeros[3]); //apresentando valor que está na posição 3 do array


        //lenght - quantos elementos tenho dentro do meu array
        for (int i=0; i<numeros.length; i++ ){
            System.out.println("A posição "+i+ " com valor de "+numeros[i]); //i index do array

        }

        //Criando array sem valor e definindo quantas posições terá!
        int [] numeros2 = new int [50];
        numeros2 [0] = 500; //atribuindo valor ao array

        double[] notas = new double[5];
        String [] nomes = {"Gabriela", "Gabriel"};
        String [] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in); //receber dados do usuário
        System.out.println("Digit um número:");
//        int quantidade = entrada.nextInt(); //guardar valor que usuário digitou
//        boolean[] valores = new boolean[quantidade];





        //EXEMPLO
        System.out.println("Digite o total de notas:");
        int totalNotas = entrada.nextInt();

        double[] notasProvas = new double[totalNotas]; //cria o array

        for( int i=0; i< totalNotas; i++){
            System.out.println("Digite o valor da nota:");
            notasProvas[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota: notasProvas){ //para cada nota ele executa
            soma+=nota;
        }
        double media = soma / notasProvas.length;

        //condição ternária, para saber se foi aprovado ou não
        String mensagem = (media<7)? "Você está reprovado": "Você está aprovado";
        System.out.println(mensagem);




        //valor padrão tipos primitivos
        int numero; // padrão = 0
        double nota2; // padrão = 0.0
        long população; // padrão  = 0
        boolean teste; // padrão = false

        // valor padrão não primitivo, classes
        String nome; //null, ausência de objeto na variável

        // Wrapper classes, involucros
        Integer numero2= 1; // representa o int em forma de classe
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;






    }
}
