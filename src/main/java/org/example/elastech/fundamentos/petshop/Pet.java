package org.example.elastech.fundamentos.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte(){
        if (peso < 10){
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        }else {
            return "Grande";
        }
    }

    void emitirSom(){
        System.out.println(nome + "faz algum som.");
    }
}
