package org.example.elastech.fundamentos.entradadados;
import java.util.Scanner;

public class ExercicioScanner {
/*
1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

4 - Peça um número e mostre a tabuada dele de 1 a 10.
 */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Exercício 1: Nome e Idade

            System.out.println("=== EXERCÍCIO 1 ===");
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            int proximoAniversario = idade + 1;
            System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + proximoAniversario + " no próximo aniversário.\n");

            // Exercício 2: Operações Matemáticas
            System.out.println("=== EXERCÍCIO 2 ===");
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            System.out.println("Soma: " + (num1 + num2));
            System.out.println("Subtração: " + (num1 - num2));
            System.out.println("Multiplicação: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Divisão: " + ((double) num1 / num2));
                System.out.println("Resto da divisão: " + (num1 % num2));
            } else {
                System.out.println("Divisão e Resto: Não é possível dividir por zero.");
            }
            System.out.println();

            // Exercício 3: Avaliação de Nota
            System.out.println("=== EXERCÍCIO 3 ===");
            System.out.print("Digite a nota da aluna: ");
            double nota = scanner.nextDouble();

            if (nota >= 7.0) {
                System.out.println("Situação: Aprovada!");
            } else if (nota >= 5.0 && nota < 7.0) {
                System.out.println("Situação: Ficou de recuperação.");
            } else {
                System.out.println("Situação: Reprovada.");
            }
            System.out.println();

            // Exercício 4: Tabuada
            System.out.println("=== EXERCÍCIO 4 ===");
            System.out.print("Digite um número para ver a tabuada: ");
            int numeroTabuada = scanner.nextInt();

            System.out.println("Tabuada do " + numeroTabuada + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
            }

            // Fechando o scanner para evitar vazamento de recursos
            scanner.close();
        }
    }

