package org.example;

public abstract class Entrega {

    protected ModoTransporte modoTransporte;
    protected float distanciaKm;

    public Entrega(float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void setModoTransporte(ModoTransporte modoTransporte) {
        this.modoTransporte = modoTransporte;
    }

    public void setDistanciaKm(float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract float calcularCustoTotal();
}
