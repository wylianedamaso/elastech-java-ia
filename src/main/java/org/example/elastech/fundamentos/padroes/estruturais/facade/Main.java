package org.example.elastech.fundamentos.padroes.estruturais.facade;

public class Main {
    public static void main(String[] args) {
        /*
         Estoque estoque = new Estoque();
         NotaFiscal notaFiscal = new NotaFiscal();
         Cobranca cobranca = new Cobranca();
         Entrega entrega = new Entrega();

        estoque.darBaixa();
        notaFiscal.emitirNotaFiscal();
        cobranca.cobrar();
        entrega.entregar();

         */

        // Usando o Facade para simplificar a vida do cliente
        CompraFacade compra = new CompraFacade();
        compra.finalizarCompra();


        ManhaFacade rotinaManha = new ManhaFacade();
        rotinaManha.acordar();
    }
}
