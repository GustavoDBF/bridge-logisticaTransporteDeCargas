package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaComSeguroTest {

    @Test
    void deveRetornarCustoEntregaComSeguroRodoviario() {
        ModoTransporte modo = new Rodoviario();
        EntregaComSeguro entrega = new EntregaComSeguro(100.0f); // 100 Km
        entrega.setModoTransporte(modo);
        entrega.setValorCarga(5000.0f); // Seguro será 500 (10%)
        assertEquals(700.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 2.0) + 500.0
    }

    @Test
    void deveRetornarCustoEntregaComSeguroAereo() {
        ModoTransporte modo = new Aereo();
        EntregaComSeguro entrega = new EntregaComSeguro(100.0f);
        entrega.setModoTransporte(modo);
        entrega.setValorCarga(5000.0f);
        assertEquals(1500.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 10.0) + 500.0
    }

    @Test
    void deveRetornarCustoEntregaComSeguroMaritimo() {
        ModoTransporte modo = new Maritimo();
        EntregaComSeguro entrega = new EntregaComSeguro(100.0f);
        entrega.setModoTransporte(modo);
        entrega.setValorCarga(5000.0f);
        assertEquals(650.0f, entrega.calcularCustoTotal(), 0.01f); // (100 * 1.5) + 500.0
    }
}