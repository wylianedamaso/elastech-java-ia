package org.example.elastech.fundamentos.petshop;

public class Cachorro extends Pet{
    @Override
    void emitirSom(){
        System.out.println(nome + " faz: Au au!");
    }
}
