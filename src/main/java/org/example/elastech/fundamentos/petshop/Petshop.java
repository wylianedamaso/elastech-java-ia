package org.example.elastech.fundamentos.petshop;

public class Petshop {
    public static void main(String[] args) {
        String nome = "Caramelo";
        String especie = "Cachorro";
        double peso = 6.5;

        System.out.printf("""
                === FICHA DO PET ===
                Nome: %s
                Espécie: %s
                Peso: %.1f kg
                ====================
                """, nome, especie, peso);
    }
}
