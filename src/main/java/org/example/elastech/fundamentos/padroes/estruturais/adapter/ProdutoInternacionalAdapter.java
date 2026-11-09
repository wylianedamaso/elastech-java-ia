package org.example.elastech.fundamentos.padroes.estruturais.adapter;

public class ProdutoInternacionalAdapter implements Produto {
    private ProdutoInternacional produtoInternacional = new ProdutoInternacional();

    @Override
    public String precoEmReais(double preco) {
        // 1. Pega o preço usando a classe internacional
        double precoDolar = produtoInternacional.calculaPrecoEmDolar(preco);

        // 2. Faz a conversão (Adaptação) de Dólar para Real (ex: cotação a 5.0)
        double cotacaoDolar = 5.0;
        double precoEmReais = precoDolar * cotacaoDolar;

        // 3. Retorna no formato que a interface Produto exige (String)
        return "R$ " + String.format("%.2f", precoEmReais) + " (Convertido de USD)";
    }
}
