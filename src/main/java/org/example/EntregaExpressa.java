package org.example;

public class EntregaExpressa extends Entrega {

    public EntregaExpressa(float distanciaKm) {
        super(distanciaKm);
    }

    public float calcularCustoTotal() {
        // Custo + taxa fixa de urgência de R$ 100,00
        return (this.distanciaKm * this.modoTransporte.taxaPorKm()) + 100.0f;
    }
}