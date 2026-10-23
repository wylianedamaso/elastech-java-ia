package org.example.elastech.fundamentos.padroes.estruturais.facade;

public class ManhaFacade {
    private Despertador despertador;
    private Cafeteira cafeteira;
    private Chuveiro chuveiro;

    public ManhaFacade() {
        this.despertador = new Despertador();
        this.cafeteira = new Cafeteira();
        this.chuveiro = new Chuveiro();
    }

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
