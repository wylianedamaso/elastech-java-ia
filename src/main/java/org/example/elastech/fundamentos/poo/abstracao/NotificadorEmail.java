package org.example.elastech.fundamentos.poo.abstracao;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] Enviando notificação: " + mensagem);
    }
}
