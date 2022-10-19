package Aulas.poo;
//extends => incluir uma outra classe /henrança
public class Cachorro extends Pet{
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        // SUPER => representa a classe PET
        super(nome, idade, peso);   //chamando o construtor da Super Classe
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;

    }
    // OVERRIDE - SOBRESCREVER MÉTODOS DA SUPER CLASSE
        @Override //anotação => vamos sobrescrever a ação de fazer som
        public void fazerSom(){
            System.out.println("Auuu Auu");
        }

        @Override
        public void brincar (){
        this.fazerSom(); //Chama o fazerSom do cachorro, que foi sobrescrito
        super.brincar();  //super, está chamando o metodo da Super Classe;
        this.dormir();    //chama o dormir da classe mãe, porque o método não foi sobrescrito
        }

        @Override
        public void comer (String comida){
         if(comida.equals(this.comidaFavorita)){ //cachorro só irá comer se a comida for IGUAL a comida favorita
             super.comer(comida); //chama o comer() do pet
                this.peso += 0.2;
//             this.setPeso(this.getPeso()+0.2);
         } else {
             System.out.println("Quero "+comida+" não!");
         }
        }


        ///////// métodos classe cachorro /////////////////
        public void correAtrasMoto(){ //metodo especifico do cachorro
        this.fazerSom();
            System.out.println("Correndo atrás da moto");
        }





    public static void main(String[] args) {
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("batata");
        pet1.fazerSom();


        Cachorro cachorro1 = new Cachorro("Rex", 5, 25, "Osoo", "Caramelo");
        cachorro1.dormir();
        cachorro1.fazerSom();
        cachorro1.comer("Arroz");
        cachorro1.setPeso(20);
        System.out.println(cachorro1.getPeso());

    }


}
