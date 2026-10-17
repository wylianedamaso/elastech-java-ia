package org.example.elastech.fundamentos.poo.encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }

        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        }else {
            saldo += valor;
        }

    }

    public void sacar(double valor){
        if (valor <= 0 || valor > saldo){
            System.out.println("Saldo indisponível para o saque.");
        }else {
            saldo -= valor;
        }


    }
}
