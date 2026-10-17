package org.example.elastech.fundamentos.poo.abstracao;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.50);
    }
}
