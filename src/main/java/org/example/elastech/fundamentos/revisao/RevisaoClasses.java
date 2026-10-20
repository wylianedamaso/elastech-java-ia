package org.example.elastech.fundamentos.revisao;

public class RevisaoClasses {
    public static void main(String[] args) {
        // 1. Crie uma classe Pet com nome, raca e peso. Crie um objeto, preencha e imprima tudo.
        Pet meuPet = new Pet();
        meuPet.nome = "Mel";
        meuPet.raca = "Poodle";
        meuPet.peso = 5.4;

        System.out.println("--- PET 1 ---");
        System.out.println("Nome: " + meuPet.nome);
        System.out.println("Raça: " + meuPet.raca);
        System.out.println("Peso: " + meuPet.peso + "kg");

        // 2. Continuando, crie dois pets diferentes e imprima as duas fichas.
        Pet pet2 = new Pet();
        pet2.nome = "Thor";
        pet2.raca = "Golden Retriever";
        pet2.peso = 30.0;

        System.out.println("\n--- PET 2 ---");
        System.out.println("Nome: " + pet2.nome + " | Raça: " + pet2.raca + " | Peso: " + pet2.peso + "kg");

        // 3. Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.quantidade = 4;
        double valorTotalEstoque = produto.preco * produto.quantidade;
        System.out.println("\nProduto: " + produto.nome + " | Total em estoque: R$ " + valorTotalEstoque);

        // 4. Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.
        Aluna aluna = new Aluna();
        aluna.nome = "Daphne";
        aluna.nota1 = 9.5;
        aluna.nota2 = 8.5;
        aluna.media = (aluna.nota1 + aluna.nota2) / 2;
        System.out.println("\nAluna: " + aluna.nome + " | Média: " + aluna.media);

        /* 🔥 Mini-desafio — Crie uma classe Jogadora com nome e pontos.
           Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação.
        */
        System.out.println("\n--- MINI-DESAFIO: MAIOR PONTUAÇÃO ---");
        Jogadora j1 = new Jogadora();
        j1.nome = "Marta";
        j1.pontos = 85;

        Jogadora j2 = new Jogadora();
        j2.nome = "Formiga";
        j2.pontos = 92;

        Jogadora j3 = new Jogadora();
        j3.nome = "Cristiane";
        j3.pontos = 78;

        Jogadora campeã = j1; // Assume a primeira como maior inicialmente

        if (j2.pontos > campeã.pontos) {
            campeã = j2;
        }
        if (j3.pontos > campeã.pontos) {
            campeã = j3;
        }

        System.out.println("A jogadora com a maior pontuação é " + campeã.nome + " com " + campeã.pontos + " pontos!");
    }
}

// Classes auxiliares para os exercícios (podem ficar no mesmo arquivo ou em arquivos separados)
class Produto {
    String nome;
    double preco;
    int quantidade;
}

class Aluna {
    String nome;
    double nota1;
    double nota2;
    double media;
}

class Jogadora {
    String nome;
    int pontos;
}

class Pet {
    String nome;
    String raca;
    double peso;
}