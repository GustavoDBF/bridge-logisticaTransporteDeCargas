package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaExpressaTest {

    @Test
    void deveRetornarCustoEntregaExpressaRodoviario() {
        ModoTransporte modo = new Rodoviario();
        EntregaExpressa entrega = new EntregaExpressa(100.0f); // 100 Km
        entrega.setModoTransporte(modo);
        assertEquals(300.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 2.0) + 100.0
    }

    @Test
    void deveRetornarCustoEntregaExpressaAereo() {
        ModoTransporte modo = new Aereo();
        EntregaExpressa entrega = new EntregaExpressa(100.0f);
        entrega.setModoTransporte(modo);
        assertEquals(1100.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 10.0) + 100.0
    }

    @Test
    void deveRetornarCustoEntregaExpressaMaritimo() {
        ModoTransporte modo = new Maritimo();
        EntregaExpressa entrega = new EntregaExpressa(100.0f);
        entrega.setModoTransporte(modo);
        assertEquals(250.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 1.5) + 100.0
    }
}