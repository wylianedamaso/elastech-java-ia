package org.example.elastech.fundamentos.poo;

public class CadastroPet {
    public static void main(String[] args) {


        Pet gato = new Pet();

        gato.nome = "Mel";
        gato.peso = 1.2;
        gato.raca = "Siamês";

        System.out.println("Minha gata se chama " + gato.nome +  " sua raça é " + gato.raca + " e ela pesa " + gato.peso + " kg.");


        Pet cachorro = new Pet();

        cachorro.nome = "Snow";
        cachorro.peso = 2.5;
        cachorro.raca = "Husky Siberiano";

        System.out.println("Meu cachorro se chama " + cachorro.nome +  " sua raça é " + cachorro.raca + " e ele pesa " + cachorro.peso + " kg.");
    }


}
