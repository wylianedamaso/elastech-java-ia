package org.example.elastech.fundamentos.padroes.criacionais.interfaces;

public class MySql implements BancoDeDados{
    private int numero = 2;

    @Override
    public int getNumero(){
        return numero;

    }

    @Override
    public String chamarBanco() {
        return "Chamando banco de dados MySQL...";
    }


}
