package org.example.elastech.fundamentos.padroes.comportamentais.observer;

public class PainelAeroporto implements ObservadorVoo{

    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " +  status);
    }
}
