package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class NotificacaoWhatsApp implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);

    }
}
