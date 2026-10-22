package org.example.elastech.fundamentos.singleton;

public class Carrinho {
    private static Carrinho instancia;

    private int quantidadeItens = 0;

    private Carrinho(){

    }

    public static Carrinho getInstancia(){
        if ( instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(){
        this.quantidadeItens++;
    }

    public int getQuantidadeItens(){
        return this.quantidadeItens;
    }

}
