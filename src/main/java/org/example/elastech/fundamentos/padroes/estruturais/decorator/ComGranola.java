package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public class ComGranola extends AcaiDecorator{
    public ComGranola(Acai acai) {
        super(acai);
    }


    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 1.50;
    }
}
