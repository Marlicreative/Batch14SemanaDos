package com.margot.claseobjetos;

/**
 * Created by Margot on 06/04/17.
 */

public class auto {
    private String color;
    private float velocidad;
    private int ruedas;
    private String motor;
    private String direccion;

    public void arrancar(){
        this.velocidad = 10.4f;
    }

    public void frenar(){
        this.velocidad = 0;
    }

    public void girar(String grados){
        this.direccion = grados;
    }


}
