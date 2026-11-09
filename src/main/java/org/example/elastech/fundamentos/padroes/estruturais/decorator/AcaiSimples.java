package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public class AcaiSimples implements Acai{
    @Override
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}
