package org.example.elastech.fundamentos.poo.abstracao;

public abstract class Forma {
    protected String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void exibirNome(){
        System.out.println("Forma: " + nome);

    }

    abstract double calcularArea();


}
