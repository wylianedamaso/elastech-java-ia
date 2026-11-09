package org.example.elastech.fundamentos.petshop;

public class Banho implements Servico{
    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }
}
