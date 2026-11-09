package org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces;

public class Oracle implements BancoDeDados {
    private int numero = 5;

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public String chamarBanco() {
        return "Chamando banco de dados Oracle...";
    }
}
