package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class NotificacaoSMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);

    }
}
