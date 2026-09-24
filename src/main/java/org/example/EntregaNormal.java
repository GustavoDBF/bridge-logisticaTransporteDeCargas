package org.example;

public class EntregaNormal extends Entrega {

    public EntregaNormal(float distanciaKm) {
        super(distanciaKm);
    }

    public float calcularCustoTotal() {
        // Custo: distância x taxa
        return this.distanciaKm * this.modoTransporte.taxaPorKm();
    }
}