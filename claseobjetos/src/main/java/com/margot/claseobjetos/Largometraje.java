package com.margot.claseobjetos;

/**
 * Created by Margot on 06/04/17.
 */

public class Largometraje{
    private String nombre;
    private int duracion;
    private float precio;
    private int expectadores;

    //Esto es un constructor, debe llamar igual que la clase, no devuelve nada, da los parámetros que pasarán,

    public Largometraje(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Fin de constructor


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExpectadores() {
        return expectadores;
    }

    public void setExpectadores(int expectadores) {
        this.expectadores = expectadores;
    }



}