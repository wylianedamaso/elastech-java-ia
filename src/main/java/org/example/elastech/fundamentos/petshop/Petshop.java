package org.example.elastech.fundamentos.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet novoPet = new Pet();

        System.out.println("Digite o nome do seu Pet:");
        novoPet.nome = scanner.nextLine();
        System.out.println("Digite agora a espécie dele:");
        novoPet.especie = scanner.nextLine();
        System.out.println("Agora digite o peso dele:");
        novoPet.peso = scanner.nextDouble();



        if (novoPet.peso < 10){
            novoPet.porte = "Pequeno";
        } else if (novoPet.peso < 25) {
            novoPet.porte = "Médio";
        }else {
            novoPet.porte = "Grande";
        }

        System.out.printf("""
                === FICHA DO PET ===
                Nome: %s
                Espécie: %s
                Peso: %.1f kg
                Porte: %s
                ====================
                """, novoPet.nome, novoPet.especie, novoPet.peso, novoPet.porte);
    }
}
