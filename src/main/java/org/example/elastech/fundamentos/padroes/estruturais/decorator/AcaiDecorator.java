package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public abstract class AcaiDecorator implements Acai{
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai){
        this.acaiEmbrulhado = acai;
    }

}
