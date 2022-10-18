package Aulas.poo;

import java.time.LocalDate;

//Encapsulamento
//Escolhe quais atributos/métodos serão visiveis fora da classe
//public (padrão) => visivel para todos
//private => os métodos/atributos são visiveis apenas na classe

public class ClienteTeste {
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993,5,25), 1.85,95.0);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobreNome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
        cliente1.setAltura(1.5);


    }
}
