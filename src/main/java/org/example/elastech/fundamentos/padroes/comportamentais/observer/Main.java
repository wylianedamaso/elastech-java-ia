package org.example.elastech.fundamentos.padroes.comportamentais.observer;

public class Main {
    public static void main(String[] args) {
        // Criamos o sujeito (Observable)
        Canal canal = new Canal();

        // Criamos os observadores (Observers)
        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");

        // COLOCANDO OS OBJETOS DENTRO DA LISTA DO CANAL
        canal.inscricao(joao);
        canal.inscricao(maria);

        // Quando o canal faz uma ação, o código roda o 'for' interno e avisa
        canal.postarVideo("Video novo.");


        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();

        voo.adicionarObservador(passageiro);

        voo.mudarStatus("Embarque iniciado");

        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(painel);
        voo.mudarStatus("Atrasado");


        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(50);
        estoque.setQuantidade(30);


    }


}
