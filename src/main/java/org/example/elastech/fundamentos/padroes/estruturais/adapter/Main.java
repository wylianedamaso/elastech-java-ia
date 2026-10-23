package org.example.elastech.fundamentos.padroes.estruturais.adapter;

public class Main {
    public static void main(String[] args) {

        Produto blusa = new ProdutoNacional();
        System.out.println("Nacional: " + blusa.precoEmReais(25.99));

        Produto blusaAmericana = new ProdutoInternacionalAdapter();
        System.out.println("Internacional adaptada: " + blusaAmericana.precoEmReais(69.80));

        // 1. Linha que tentaria usar PayPalAPI direto como Pagamento (não compila):
        // Pagamento pagamentoInvalido = new PayPalAPI();
        // (Erro: Incompatible types - PayPalAPI cannot be converted to Pagamento)
        Pagamento pagamentoPayPal = new PayPalAdapter();
        pagamentoPayPal.pagar();
    }
}
