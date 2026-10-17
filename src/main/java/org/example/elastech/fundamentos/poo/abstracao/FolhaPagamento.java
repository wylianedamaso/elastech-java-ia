package org.example.elastech.fundamentos.poo.abstracao;

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public void pagar(Funcionario funcionario) {
        double salarioCalculado = funcionario.calcularSalario();

        System.out.println("Processando pagamento para: " + funcionario.calcularSalario());

        System.out.println("Valor a pagar: R$ " + salarioCalculado);

        notificador.notificar("Olá " + funcionario.getNome() + ", seu pagamento de R$ " + salarioCalculado + " foi efetuado!");
    }
}
