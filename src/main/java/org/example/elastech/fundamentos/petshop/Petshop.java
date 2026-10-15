package org.example.elastech.fundamentos.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet[] lista = new Pet[5];
        int opcao = -1;
        int total = 0;

        while (opcao != 0) {
            System.out.println("""
                    === PETSHOP ===
                    1 - Cadastrar pet
                    0 - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Escolha: " + opcao);

            switch (opcao) {
                case 1:
                    Pet novoPet = new Pet();

                    System.out.println("Digite o nome do seu Pet:");
                    novoPet.nome = scanner.nextLine();
                    System.out.println("Digite agora a espécie dele:");
                    novoPet.especie = scanner.nextLine();
                    System.out.println("Agora digite o peso dele:");
                    novoPet.peso = scanner.nextDouble();
                    scanner.nextLine();

                    novoPet.porte = novoPet.definirPorte();

                    lista[total] = novoPet;
                    total++;

                    System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");

                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        }

    }
}
