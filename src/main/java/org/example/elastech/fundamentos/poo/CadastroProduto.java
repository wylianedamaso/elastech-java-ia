package org.example.elastech.fundamentos.poo;

import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1 ; i <= 3;i ++){
            Produto novoProduto = new Produto();

            System.out.println("Qual o nome do produto? Digite:");
            novoProduto.nome = scanner.nextLine();
            System.out.println("Qual o preço do produto? Digite:");
            novoProduto.preco = scanner.nextDouble();
            scanner.nextLine();


            if (novoProduto.preco > 100){
                System.out.printf("O produto %s custa R$%.2f. Produto caro!%n", novoProduto.nome, novoProduto.preco);
            }else {
                System.out.printf("O produto %s custa R$%.2f. Produto com preço acessível!%n", novoProduto.nome, novoProduto.preco);
            }

        }

    }
}
