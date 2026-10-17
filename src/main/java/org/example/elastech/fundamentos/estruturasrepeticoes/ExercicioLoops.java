package org.example.elastech.fundamentos.estruturasrepeticoes;

public class ExercicioLoops {

        public static void main(String[] args) {

            // Exercício 1: Números de 1 a 30 usando FOR
            System.out.println("=== EXERCÍCIO 1 (FOR) ===");
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }
            System.out.println();

            // Exercício 2: Contagem regressiva de 10 até 1
            System.out.println("=== EXERCÍCIO 2 (Contagem Regressiva) ===");
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Fim!\n");

            // Exercício 3: Números de 1 a 30 usando WHILE e Comparação
            System.out.println("=== EXERCÍCIO 3 (WHILE) ===");
            int contador = 1;
            while (contador <= 30) {
                System.out.println(contador);
                contador++; // Importante para evitar loop infinito!
            }
            System.out.println();

            /*
             * COMPARAÇÃO ENTRE FOR E WHILE (Exercício 1 vs Exercício 3):
             * - O 'for' é ideal quando sabemos exatamente quantas vezes o bloco vai repetir
             *   (a inicialização, a condição e o incremento ficam reunidos na mesma linha).
             * - O 'while' é mais flexível para situações onde a repetição depende de uma condição
             *   que pode mudar de forma dinâmica. Nele, declaramos a variável antes do bloco
             *   e precisamos lembrar de incrementar manualmente dentro dele para o loop ter fim.
             */

            // Exercício 4: Tabuada com variável pré-definida
            System.out.println("=== EXERCÍCIO 4 (Tabuada Fixa) ===");
            int numero = 5; // Posso alterar este valor para testar outros números

            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

