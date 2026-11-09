package org.example.elastech.fundamentos.poo.abstracao;

public class Retangulo extends Forma{
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }
}
