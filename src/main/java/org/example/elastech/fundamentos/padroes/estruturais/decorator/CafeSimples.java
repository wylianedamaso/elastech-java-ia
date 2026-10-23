package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public class CafeSimples implements Cafe {


    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
