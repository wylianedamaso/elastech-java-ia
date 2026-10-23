package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class Main {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        Animal animal = factory.getAnimal("cachorro");
        Animal segundoAnimal = factory.getAnimal("gato");

        animal.emitirSom();
        segundoAnimal.emitirSom();

    }
}
