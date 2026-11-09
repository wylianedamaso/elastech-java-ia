package org.example.elastech.fundamentos.petshop;

import java.util.*;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pet> lista = new ArrayList<>();
        int opcao = -1;

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
                    8 - Mostrar ficha do pet com sobrecarga
                    9 - Ver total de pets cadastrados
                    10 - Filtrar pets por porte
                    11 - Atender todos da fila de banho
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

                        lista.add(novoPet);

                        System.out.println("Pet cadastrado! Agora são " +lista.size() + " pet(s).");

                        break;

                    case 2:
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("--- PETS CADASTRADOS ---");
                            for (Pet pet : lista) {
                                System.out.println(pet.nome + " (" + pet.especie + ") - " + pet.peso + " kg - Porte " + pet.porte);
                                pet.emitirSom();

                                if (pet instanceof Cachorro) {
                                    Cachorro cachorro = (Cachorro) pet;
                                    cachorro.buscarBolinha();
                                }
                            }
                        }
                        break;

                    case 3:
                        boolean achou = false;
                        System.out.println("Qual pet você procura?");
                        String busca = scanner.nextLine();
                        for (Pet pet : lista) {
                            if (pet.nome.equalsIgnoreCase(busca)) {
                                System.out.println(pet.nome + " (" + pet.especie + ") - " + pet.peso + " kg - Porte " + pet.porte);
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

                        for (Pet pet : lista){
                            especies.add(pet.especie.toLowerCase());
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
                        listaServico.add(new Vacina());

                        for (Servico servico : listaServico){
                            servico.executar(nomeServico);
                        }
                        break;

                    case 8:
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado para testar.");
                        } else {
                            System.out.println("Qual o nome do pet que deseja ver a ficha?");
                            String buscaFicha = scanner.nextLine();
                            boolean encontrado = false;

                            for (Pet pet : lista) {
                                if (pet.nome.equalsIgnoreCase(buscaFicha)) {
                                    System.out.println("\n--- Testando método 1 (só nome) ---");
                                    mostrarFicha(pet);

                                    System.out.println("\n--- Testando método 2 (com título - Sobrecarga) ---");
                                    mostrarFicha(pet, "=== FICHA DO PET ===");

                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Pet não encontrado.");
                            }
                        }

                        break;

                    case 9:
                        System.out.println("Total de pets cadastrados no sistema: " + lista.size());
                        break;

                    case 10:
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("Qual porte você deseja buscar (Pequeno, Médio, Grande)?");
                            String porteBusca = scanner.nextLine();
                            boolean achouPorte = false;

                            System.out.println("--- PETS COM PORTE " + porteBusca.toUpperCase() + " ---");
                            for (Pet pet : lista){
                                if (pet.porte.equalsIgnoreCase(porteBusca)){
                                    System.out.println(pet.nome + " (" + pet.especie + ") - " + pet.peso + "kg");
                                    achouPorte = true;
                                }
                            }
                            if (!achouPorte) {
                                System.out.println("Nenhum pet encontrado com esse porte.");
                            }
                        }
                        break;

                    case 11:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila de banho já está vazia.");
                        } else {
                            System.out.println("Atendendo todos os pets da fila: " + filaBanho);
                            filaBanho.clear();
                            System.out.println("Todos os pets foram atendidos! Fila limpa.");
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

    static void mostrarFicha(Pet pet){
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + "kg");
        System.out.println("Porte: " + pet.porte);
    }
}