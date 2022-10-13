import java.time.LocalDate;
import java.time.LocalTime;

public class EstudoDatas {
    public static void main (String[]args){
        //localdate, armanece qualquer data (dia, mês e ano)
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); //verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal));//verifica se a data é antes da especificada

        int ano = hoje.getYear(); //pegar apenas ano
        int mes = hoje.getMonthValue(); //o número do mês
        int dia = hoje.getDayOfMonth(); //o número do dia


        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear(); //subtrai a data natal pelo dia de hoje


        System.out.println("Faltam "+diasParaNatal+" dias p/ natal!!!");








    }
}
