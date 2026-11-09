package org.example.elastech.fundamentos.padroes.comportamentais.observer;

import java.util.ArrayList;

public class Canal {
    private ArrayList<Inscrito> inscritos = new ArrayList<>();
    private String nomeVideo;

    public void inscricao(Inscrito inscritos){
        this.inscritos.add(inscritos);
    }

    public void desinscrever(Inscrito inscrito){
        this.inscritos.remove(inscrito);
    }

    private void notificacao(){
        for (Inscrito inscrito : inscritos) {
            inscrito.receberNotificacao("Vídeo novo na área: " + nomeVideo);
        }
    }

    public void postarVideo(String nomeVideo){
        this.nomeVideo = nomeVideo;
        System.out.println("Novo vídeo postado!: " + nomeVideo);
        notificacao();

    }

}
