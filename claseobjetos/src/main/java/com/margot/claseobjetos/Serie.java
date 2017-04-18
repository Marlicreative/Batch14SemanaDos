package com.margot.claseobjetos;

import android.util.Log;

/**
 * Created by Margot on 06/04/17.
 */

public class Serie extends Largometraje {

    public String capitulos;

    public Serie (String nombre, float precio){
        super(nombre, precio);

    }

    public void reproducir(){
        Log.e("myLog", "Reproduciendo serie: " + getNombre());
    }

    public String getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }
}
