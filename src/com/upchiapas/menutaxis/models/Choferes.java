package com.upchiapas.menutaxis.models;

public class Choferes {

    private String ID;
    private String nombre;
    private String eda;
    private Choferes[] listaChoferes = new Choferes[5];

    public Choferes() {
    }

    public void setID(String ID) {
    }

    public void setEda(Short eda) {
    }

    public void setNombre(String nombre) {
    }

    public String toString() {
        return "ID: " + this.ID + " nombre: " + this.nombre + " Edad: " + this.eda;
    }
}


