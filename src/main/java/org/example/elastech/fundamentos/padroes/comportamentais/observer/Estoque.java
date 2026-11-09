package org.example.elastech.fundamentos.padroes.comportamentais.observer;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observadorEstoque){
        observadores.add(observadorEstoque);
    }

    public void  setQuantidade(int quantidade){
        for (ObservadorEstoque observador : observadores){
            observador.atualizar(quantidade);
        }
    }
}
