package Aulas;

import java.sql.SQLOutput;


// Enums são estruturas com constantes definidas
// Dias da semana, Meses do ano, Turnos do dia, Estações
// Níveis (junior, pleno, senior), Feriados nacionais, Naipes

public class EstudoEnums {

    public static void main(String[] args) {
        enum DiadaSemana{
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiadaSemana hoje = DiadaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev{JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nível é junior");
                break;
            case PLENO:
                System.out.println("Seu nível é pleno");
                break;
            case SENIOR:
                System.out.println("Seu nível é senior");
                break;
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
