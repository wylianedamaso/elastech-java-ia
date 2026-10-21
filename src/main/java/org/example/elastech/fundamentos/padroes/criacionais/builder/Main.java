package org.example.elastech.fundamentos.padroes.criacionais.builder;

public class Main {
    public static void main(String[] args) {

        Agendamento thor = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10.0);

        Agendamento luna = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0);

        Agendamento mel = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0.0);

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }

}
