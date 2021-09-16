package com.mycompany.poo;

public abstract class Personaje {
    private String Nombre;
    private int Vida;

    public String getNombre() {
        return Nombre;
    }

    public int getVida() {
        return Vida;
    }
    
    public abstract void Modificarvida();
    
}
