package org.example.elastech.fundamentos.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {
    CalculadoraDesconto calculadora = new CalculadoraDesconto();

    @Test
    public void deveManterValorParaClienteComum() {

        // Arrange
        double valorCompra = 50.0;
        boolean clienteVip = false;

        // Act
        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // Assert
        assertEquals(50.0, resultado);
    }

    @Test
    public void deveAplicarDescontoParaClienteVip() {

        // Arrange
        double valorCompra = 200.0;
        boolean clienteVip = true;

        // Act
        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // Assert
        assertEquals(180.0, resultado);
    }

    @Test
    public void deveLancarErroParaValorNegativo() {

        // Arrange
        double valorCompra = -10.0;
        boolean clienteVip = false;

        // Act e Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.aplicarDesconto(valorCompra, clienteVip)
        );
    }
}
