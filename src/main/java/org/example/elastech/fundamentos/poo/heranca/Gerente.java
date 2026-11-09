package org.example.elastech.fundamentos.poo.heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    void aprovarFerias(String quem){
        System.out.println("As ferias de " + quem + " foram aprovadas.");
    }
    @Override
    public void exportar() {
        System.out.println("Exportando");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
