package org.example.elastech.fundamentos.poo.encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-XY";

    public String getNumeroConta(){
        return numeroConta;
    }
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
            registrarLog("Depósito", valor);
        }

    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido!");

        } else if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            registrarLog("Saque", valor);
        }

    }

    private boolean temSaldo(double valor){
        return saldo >= valor;
    }

    private void registrarLog(String acao, double valor){
        System.out.println("[LOG] " + titular + ": " + acao + " de " + valor);
    }
}
