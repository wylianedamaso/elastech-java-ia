package org.example.elastech.fundamentos.poo.abstracao;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            System.out.println("Preço inválido! Deve ser maior que zero.");
            return;
        }
        this.preco = preco;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            System.out.println("Quantidade inválida! Não pode ser negativa.");
            return;
        }
        this.quantidade = quantidade;
    }
}
