package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaNormalTest {

    @Test
    void deveRetornarCustoEntregaNormalRodoviario() {
        ModoTransporte modo = new Rodoviario();
        EntregaNormal entrega = new EntregaNormal(100.0f); // 100 Km
        entrega.setModoTransporte(modo);
        assertEquals(200.0f, entrega.calcularCustoTotal(), 0.01f); // 100 * 2.0
    }

    @Test
    void deveRetornarCustoEntregaNormalAereo() {
        ModoTransporte modo = new Aereo();
        EntregaNormal entrega = new EntregaNormal(100.0f);
        entrega.setModoTransporte(modo);
        assertEquals(1000.0f, entrega.calcularCustoTotal(), 0.01f); // 100 * 10.0
    }

    @Test
    void deveRetornarCustoEntregaNormalMaritimo() {
        ModoTransporte modo = new Maritimo();
        EntregaNormal entrega = new EntregaNormal(100.0f);
        entrega.setModoTransporte(modo);
        assertEquals(150.0f, entrega.calcularCustoTotal(), 0.01f); // 100 * 1.5
    }
}