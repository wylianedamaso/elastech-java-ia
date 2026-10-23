package org.example.elastech.fundamentos.padroes.estruturais.facade;

public class CompraFacade {
    // Mantendo os subsistemas encapsulados (private)
    private Estoque estoque;
    private NotaFiscal notaFiscal;
    private Cobranca cobranca;
    private Entrega entrega;

    // Construtor para inicializar os subsistemas
    public CompraFacade() {
        this.estoque = new Estoque();
        this.notaFiscal = new NotaFiscal();
        this.cobranca = new Cobranca();
        this.entrega = new Entrega();
    }

    public void finalizarCompra() {
        System.out.println("=== Iniciando processo de finalização da compra ===");
        estoque.darBaixa();
        cobranca.cobrar();
        notaFiscal.emitirNotaFiscal();
        entrega.entregar();
        System.out.println("=== Compra finalizada com sucesso! ===\n");
    }
}
