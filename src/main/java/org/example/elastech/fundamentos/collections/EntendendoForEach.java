package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.List;

public class EntendendoForEach {

    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "Leão", "Guaxinim"));

        //normal
        for (int i = 0; i < animais.size(); i ++){
            System.out.println(animais.get(i));
        }

        //for each - para cada animal dentro de animais. Usado para ver a lista ou usar os elementos da lista. Não
        for(String animal : animais){
            System.out.println(animal);
        }
    }
}
