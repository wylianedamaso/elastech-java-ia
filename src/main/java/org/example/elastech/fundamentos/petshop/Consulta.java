package org.example.elastech.fundamentos.petshop;

public class Consulta implements Servico{
    @Override
    public void executar(String nomePet) {
        System.out.println("Levando " + nomePet + " para a consulta...");
    }
}
