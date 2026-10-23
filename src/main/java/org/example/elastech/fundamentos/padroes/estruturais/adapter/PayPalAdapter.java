package org.example.elastech.fundamentos.padroes.estruturais.adapter;

public class PayPalAdapter implements Pagamento{

    private PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pagar() {
        // O adapter traduz a chamada do método "pagar()" para o método da biblioteca externa "sendPayment()"
        payPalAPI.sendPayment();
    }
}
