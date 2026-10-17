package org.example.elastech.fundamentos.poo.abstracao;

public  class Abstracao{
    public static void main(String[] args) {

        //Exercício 3
        Produto produto = new Produto();
        produto.setNome("Caneta");
        produto.setPreco(0.00); // Aqui imprime - Preço inválido! Deve ser maior que zero.
        produto.setQuantidade(-2); // Aqui imprime - Quantidade inválida! Não pode ser negativa.

        produto.setQuantidade(2);
        produto.setPreco(1.50);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        //Exercício 5
        Retangulo retangulo = new Retangulo("Retângulo", 6, 4);

        retangulo.exibirNome();
        System.out.println("Área calculada: " + retangulo.calcularArea());

        //Forma f = new Forma("teste"); -> Como Forma é abstrata ela não pode ser instanciada.

        //Exercício 6
        System.out.println("\n=== SISTEMA DE FUNCIONÁRIOS ===");

        Funcionario desenvolvedor = new Desenvolvedor("Stella Dev", 4000.00);

        Funcionario gerente = new Gerente("Flávia Genrente", 8000.00);

        //Testando pagamento com Notificação por E-MAIL
        System.out.println("--- Folha de Pagamento com E-MAIL ---");
        Notificador emailNotificador = new NotificadorEmail();
        FolhaPagamento folhaEmail = new FolhaPagamento(emailNotificador);

        folhaEmail.pagar(desenvolvedor);
        folhaEmail.pagar(gerente);

        //Testando pagamento com Notificação por SMS
        System.out.println("--- Folha de Pagamento com SMS ---");
        Notificador smsNotificador = new NotificadorSms();
        FolhaPagamento folhaSms = new FolhaPagamento(smsNotificador);

        folhaSms.pagar(desenvolvedor);
        folhaSms.pagar(gerente);

    }
}
