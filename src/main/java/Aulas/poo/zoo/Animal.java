package Aulas.poo.zoo;

// Na interface você define um conjunto de métodos (sem corpo)
// E a classe que "herda"deve implementar esses métodos
//implements
// comportamentos
// preciso sobrescrever todos os métodos criados
// INTERFACE, NÃO CONSIGO CRIAR UM OBJETO
public interface Animal {
    void dormir();  //apenas definição dos métodos
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{  //necessário usar IMPLEMENTS para usar os métodos
    @Override
    public void dormir(){
        System.out.println("zzzzzzz miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Hummm gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("Có có zzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hummm có có " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        // Interface não consigo criar um objeto
        // Animal novoAnimal = new Animal(); // não consigo criar pois é Interface
        Animal animalGalinha = galinha;
        Animal animalGatinho = gato;
        System.out.println(" ===== POLIMORFISMO ===== ");
        animalGatinho.fazerSom();
        animalGalinha.fazerSom();
    }
}