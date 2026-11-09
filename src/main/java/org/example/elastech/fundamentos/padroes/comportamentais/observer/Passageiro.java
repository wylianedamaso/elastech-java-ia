package org.example.elastech.fundamentos.padroes.comportamentais.observer;

public class Passageiro implements ObservadorVoo{
    @Override
    public void atualizar(String status) {
        System.out.println( "Passageiro avisado: " +  status);
    }

}
