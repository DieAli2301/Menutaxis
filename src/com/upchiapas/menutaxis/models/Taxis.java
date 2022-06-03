package com.upchiapas.menutaxis.models;

public class Taxis {

    private String model;
    private String marc;
    private int taxi;

    public Taxis(String modelo, String marca, int taxi) {
        this.model = this.model;
        this.marc = this.marc;
        this.taxi = taxi;
    }

    public Taxis() {
    }

    public void setMarc(String marc) {
    }

    public void setModel(String model) {
    }

    public void setTaxi(int taxi) {
    }

    public String toString() {
        return " Marca: " + this.marc + " modelo:" + this.model + " numero de taxi: " + this.taxi;
    }
}
