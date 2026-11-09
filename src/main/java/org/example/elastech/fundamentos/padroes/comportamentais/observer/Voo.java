package org.example.elastech.fundamentos.padroes.comportamentais.observer;

import com.sun.jdi.ObjectReference;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> observadorVoos = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observadorVoo){
       observadorVoos.add(observadorVoo);

    }

    public void mudarStatus(String status){
        for (ObservadorVoo observadorVoo : observadorVoos){
            observadorVoo.atualizar(status);
        }
    }
}
