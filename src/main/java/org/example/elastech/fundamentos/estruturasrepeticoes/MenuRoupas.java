package org.example.elastech.fundamentos.estruturasrepeticoes;

import java.util.Scanner;

public class MenuRoupas {
    /*
    3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

     */
    public static void main(String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
            Escolha uma opção:
            1 - Ver camisas
            2 - Ver calças
            3 - Sair""");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou Camisas\n");
                    break;
                case 2:
                    System.out.println("Você selecionou Calças\n");
                    break;
                case 3:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");

            }

        }while (opcao != 3);
    }

}

