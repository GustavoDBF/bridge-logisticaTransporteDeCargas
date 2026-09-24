package org.example;

public class EntregaComSeguro extends Entrega {

    private float valorCarga;

    public EntregaComSeguro(float distanciaKm) {
        super(distanciaKm);
    }

    public void setValorCarga(float valorCarga) {
        this.valorCarga = valorCarga;
    }

    public float calcularCustoTotal() {
        // Custo + 10% do valor da carga como seguro
        return (this.distanciaKm * this.modoTransporte.taxaPorKm()) + (this.valorCarga * 0.10f);
    }
}