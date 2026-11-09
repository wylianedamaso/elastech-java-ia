package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public class Main {
    public static void main(String[] args) {

        //Só café puro
        Cafe pedido1 = new CafeSimples();
        System.out.println(pedido1.getDescricao() + " = R$ " + pedido1.getPreco());

        //Café com Leite
        Cafe pedido2 = new ComLeite(new CafeSimples());
        System.out.println(pedido2.getDescricao() + " = R$ " + pedido2.getPreco());

        //Café com Leite e Chocolate
        Cafe pedido3 = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println(pedido3.getDescricao() + " = R$ " + pedido3.getPreco());

        //Café com Chocolate e Leite
        Cafe pedido4 = new ComLeite(new ComChocolate(new CafeSimples()));
        System.out.println(pedido4.getDescricao() + " = R$ " + pedido4.getPreco());

        //Açaí simples
        Acai simples = new AcaiSimples();

        System.out.println(simples.getDescricao() + " = R$ " + simples.getPreco());

        //Açaí com Granola
        Acai comGranola = new ComGranola(new AcaiSimples());

        System.out.println(comGranola.getDescricao() + " = R$ " + comGranola.getPreco());

        //Açaí com Morango e Granola
        Acai completo = new ComMorango( new ComGranola(new AcaiSimples()));

        System.out.println(completo.getDescricao() + " = R$ " + completo.getPreco());



    }
}
