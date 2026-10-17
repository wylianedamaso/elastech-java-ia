package org.example.elastech.fundamentos.petshop;

import java.util.*;

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
                    7 - Executar serviços no pet
                    0 - Sair
                    Escolha uma opção:
                    """);

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:

                        System.out.println("Digite o nome do seu Pet:");
                        String nomeDigitado = scanner.nextLine();

                        Pet novoPet;

                        System.out.println("Digite agora a espécie dele:");
                        String especieDigitada = scanner.nextLine();
                        System.out.println("Agora digite o peso dele:");
                        double pesoDigitado = scanner.nextDouble();
                        scanner.nextLine();

                        if (especieDigitada.equalsIgnoreCase("Cachorro")){
                            novoPet = new Cachorro();
                        } else if (especieDigitada.equalsIgnoreCase("Gato")) {
                            novoPet = new Gato();
                        } else {
                            novoPet = new Pet();
                        }

                        novoPet.nome = nomeDigitado;
                        novoPet.especie = especieDigitada;
                        novoPet.peso = pesoDigitado;
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

                    case 7:
                        System.out.println("Nome do pet:");
                        String nomeServico = scanner.nextLine();

                        ArrayList<Servico> listaServico = new ArrayList<>();
                        listaServico.add(new Banho());
                        listaServico.add(new Tosa());
                        listaServico.add(new Consulta());

                        for (Servico servico : listaServico){
                            servico.executar(nomeServico);
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
