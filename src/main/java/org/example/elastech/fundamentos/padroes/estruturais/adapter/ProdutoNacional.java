package org.example.elastech.fundamentos.padroes.estruturais.adapter;

public class ProdutoNacional implements Produto {

    @Override
    public String precoEmReais(double preco) {
        return "R$ " + String.format("%.2f", preco);
    }
}