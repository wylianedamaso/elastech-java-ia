package org.example.elastech.fundamentos.desafios;

import java.util.Scanner;

public class SistemaCadastroAlunas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2){
            System.out.println("Gostaria de iniciar? Digite 1 para continuar ou 2 para sair:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Aluna novaAluna = new Aluna();

                    System.out.println("Digite a primeira nota:");
                    novaAluna.nota1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a segunda nota:");
                    novaAluna.nota2 = scanner.nextDouble();
                    scanner.nextLine();
                    novaAluna.media = (novaAluna.nota1 + novaAluna.nota2) / 2 ;
                    System.out.println("Digite seu nome:");
                    novaAluna.nome = scanner.nextLine();

                    if (novaAluna.media >= 6){
                        novaAluna.passou = true;
                    }else {
                        novaAluna.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna aprovada: %b.%n", novaAluna.nome, novaAluna.nota1, novaAluna.nota2, novaAluna.media, novaAluna.passou);
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");

                    break;

                default:
                    System.out.println("Opção inválida.");

            }


        }
    }
}
