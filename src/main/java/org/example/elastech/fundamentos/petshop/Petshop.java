package org.example.elastech.fundamentos.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu Pet:");
        String nome = scanner.nextLine();
        System.out.println("Digite agora a espécie dele:");
        String especie = scanner.nextLine();
        System.out.println("Agora digite o peso dele:");
        double peso = scanner.nextDouble();

        System.out.printf("""
                === FICHA DO PET ===
                Nome: %s
                Espécie: %s
                Peso: %.1f kg
                ====================
                """, nome, especie, peso);
    }
}
