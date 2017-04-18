package com.margot.claseobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Pelicula pelicula = new Pelicula("Harry Potter", 300f);
            Documental documental = new Documental("Vida salvaje", 50f);
            Serie serie = new Serie("Orange is the new black", 39f);

        reproducirLoqueSea(pelicula);
        reproducirLoqueSea(documental);
        reproducirLoqueSea(serie);
    }

    public void reproducirPelicula(Pelicula pelicula) {
        pelicula.reproducir();
    }
    public void reproducirDocumental(Documental documental) {
        documental.reproducir();
    }
    public void reproducirSerie(Serie serie) {
        serie.reproducir();
    }

    public void reproducirLoqueSea(Largometraje largometraje){
        if (largometraje instanceof  Pelicula){
            Pelicula pelicula = (Pelicula) largometraje;
            pelicula.reproducir();
        }else if(largometraje instanceof  Documental){
            Documental documental = (Documental) largometraje;
            documental.reproducir();
        }else if(largometraje instanceof Serie){
            Serie serie = (Serie) largometraje;
            serie.reproducir();
        }
    }
}
