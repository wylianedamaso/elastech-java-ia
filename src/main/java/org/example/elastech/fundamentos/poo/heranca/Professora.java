package org.example.elastech.fundamentos.poo.heranca;

public class Professora extends Pessoa {

    public String disciplina;

   public void lancarNotas(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s.%n", nome, nota, aluna);
    }
    // Sobrescrita: mesma assinatura do método herdado de Pessoa.
    @Override
    public void apresentar(){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");

    }
    // Sobrecarga: mesmo nome, mas com um parâmetro diferente. Não usa @Override porque Pessoa não possui apresentar(String cargo).
   public void apresentar(String cargo){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + " e o meu cargo é " + cargo + ".");
    }
}
