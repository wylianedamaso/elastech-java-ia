package org.example.elastech.fundamentos.interfaces;

public class Email implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }
}
