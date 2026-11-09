package org.example.elastech.fundamentos.padroes.criacionais.builder;

import lombok.Builder;

@Builder
public class Agendamento {

    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println("--- Agendamento ---");
        System.out.println("Pet: " + nomePet + " | Serviço: " + servico + " | Horário: " + horario +
                " | Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao +
                " | Obs: " + observacao + " | Desconto: " + desconto + "%");
    }
}
