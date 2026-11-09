package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class NotificacaoFactory {
    public static Notificacao criar(String tipo){
        if (tipo.equalsIgnoreCase("email")){
            return new NotificacaoEmail();

        } else if (tipo.equalsIgnoreCase("sms")){
            return new NotificacaoSMS();

        } else if (tipo.equalsIgnoreCase("whatsapp")) {
            return new NotificacaoWhatsApp();

        } else {
            throw new IllegalArgumentException("Tipo inválido!");
        }
    }
}
