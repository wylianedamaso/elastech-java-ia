package org.example.elastech.fundamentos.poo.abstracao;

public class NotificadorSms implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] Enviando notificação: " + mensagem);
    }
}
