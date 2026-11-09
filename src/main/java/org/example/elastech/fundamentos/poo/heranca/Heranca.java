package org.example.elastech.fundamentos.poo.heranca;

public class Heranca {
    /*
    1. Crie a classe Pessoa com os atributos nome e idade, e o método
   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."

   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
   e os três funcionaram.

2. Acrescente na Aluna o atributo curso e o método estudar(), que
   imprime "[nome] está estudando [curso]."

   Preencha os três atributos no objeto e chame os dois métodos.

   Repare que o estudar() usa o nome, que veio da mãe.

3. Crie a classe Professora, também filha de Pessoa, com o atributo
   disciplina e o método lancarNota(String aluna, double nota), que
   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
   com %.1f.

      Na Main, crie uma aluna e uma professora, preencha os atributos de
   cada objeto e chame os métodos das duas.

4. Na Professora, sobrescreva o apresentar() usando @Override, pra
   imprimir "Oi, sou [nome] e ensino [disciplina]."

   Chame apresentar() na aluna e na professora e compare as saídas.

5. Faça uma cadeia de três níveis:
   - Funcionario, com o atributo nome e o método baterPonto()
   - Gerente extends Funcionario, com aprovarFerias(String quem)
   - Diretora extends Gerente, com definirMeta(String meta)

   Na Main, crie uma Diretora, preencha o nome dela
   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.

   Herança em cadeia: ela tem tudo que vem de cima.

6. Crie duas interfaces:
   - Notificavel, com notificar(String mensagem)
   - Exportavel, com exportar()

   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
   extends Funcionario:

   class Gerente extends Funcionario implements Notificavel, Exportavel

    Na Main, crie um gerente, preencha o nome e chame os quatro
   métodos nele: baterPonto(), aprovarFerias(), notificar()
   e exportar().

   UMA herança (extends), VÁRIAS interfaces (implements).
   Depois tente colocar uma segunda classe no extends:
   extends Funcionario, Pessoa
   Veja o que o Java responde.
     */
    public static void main(String[] args) {
        //Exercício 1
        Aluna aluna = new Aluna();
        aluna.nome = "Sabrina";
        aluna.idade = 20;
        aluna.apresentar();

        //Exercício 2
        aluna.curso = "Engenharia Quântica";
        aluna.estudar();

        //Exercício 3
        Professora professora = new Professora();

        professora.nome = "Flora";
        professora.idade = 29;
        professora.disciplina = "Matemática";
        professora.apresentar();

        //Exercício 4
        aluna.apresentar();
        professora.apresentar();

        //Exercício 5
        Diretora diretora = new Diretora();

        diretora.nome = "Carla";
        diretora.baterPonto();
        diretora.aprovarFerias("Samantha");
        diretora.definirMeta("Vender 500 únidade de Smartphones");

        //Exercício 6
        Gerente gerente = new Gerente();
        gerente.nome = "Roger";

        gerente.baterPonto();
        gerente.aprovarFerias("Luiza");
        gerente.exportar();
        gerente.notificar("Notificando");


    }
}
