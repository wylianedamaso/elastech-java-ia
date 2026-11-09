package org.example.elastech.fundamentos.petshop;

public class Cachorro extends Pet{
    @Override
    void emitirSom(){
        System.out.println(nome + " faz: Au au!");
    }

    public void buscarBolinha(){
        System.out.println(nome + " foi buscar a bolinha! ");
    }
}
