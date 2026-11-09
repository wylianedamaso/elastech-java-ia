package org.example.elastech.fundamentos.padroes.criacionais.factory;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);

    }
}
