package org.example.elastech.fundamentos.poo.abstracao;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.20);
    }
}
