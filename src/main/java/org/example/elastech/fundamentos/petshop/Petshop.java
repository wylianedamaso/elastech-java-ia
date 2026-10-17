package org.example.elastech.fundamentos.petshop;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet[] lista = new Pet[5];
        int opcao = -1;
        int total = 0;

        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println("""
                    \n=== PETSHOP ===
                    1 - Cadastrar pet
                    2 - Listar pets
                    3 - Buscar pet por nome
                    4 - Mostrar espécies cadastradas
                    5 - Entrar na fila de banho
                    6 - Atender próximo da fila
                    0 - Sair
                    Escolha uma opção:
                    """);

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

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

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg - Porte " + lista[i].porte);
                            }
                        }
                        break;

                    case 3:
                        boolean achou = false;
                        System.out.println("Qual pet você procura?");
                        String busca = scanner.nextLine();
                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg - Porte " + lista[i].porte);
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total ; i++){
                            especies.add(lista[i].especie);
                        }

                        System.out.println("--- ESPÉCIES CADASTRADAS ---");
                        for (String especie : especies){
                            System.out.println("- " + especie);
                        }

                        System.out.println("Total de espécies diferentes: " + especies.size());
                        break;

                    case 5:
                        System.out.println("Nome do pet pra entrar na fila:");
                        String petFila = scanner.nextLine();
                        filaBanho.add(petFila);
                        System.out.println(petFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()){
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximo = filaBanho.poll();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Digite apénas números");
                scanner.nextLine();
            }

        }
        scanner.close();

    }
}
