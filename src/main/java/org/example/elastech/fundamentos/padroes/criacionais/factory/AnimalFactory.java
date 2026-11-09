package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class AnimalFactory {
    public Animal getAnimal(String animal){
        if (animal == null) {
            return null;
        }
        if (animal.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }else if (animal.equalsIgnoreCase("gato")){
            return new Gato();
        }else {
            throw new IllegalArgumentException("Animal desconhecido: " + animal);
        }
    }

}