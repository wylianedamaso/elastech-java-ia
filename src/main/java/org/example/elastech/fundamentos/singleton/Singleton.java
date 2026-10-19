package org.example.elastech.fundamentos.singleton;

public class Singleton {
    public static void main(String[] args) {
        //Exercício 6
        // Obtendo duas vezes em variáveis diferentes sem usar o new
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        // Registrando visitas usando as duas variáveis
        pagina1.registrarVisita();
        pagina2.registrarVisita();
        pagina1.registrarVisita();

        // Imprimindo o total (mostrando que compartilham o mesmo estado)
        System.out.println("Total de visitas: " + pagina1.getTotal());

        //Exercício 7
        // Obtendo o carrinho em duas variáveis diferentes
        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        // Adicionando itens usando as duas telas
        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        // Imprimindo a quantidade final
        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}
