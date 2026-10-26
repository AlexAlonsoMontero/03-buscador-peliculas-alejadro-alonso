package com.peliculas.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {
    // de la película, año de estreno y grado de adecuación a los criterios
    private String titulo;
    private int anioEstreno;
    private String gradoAdecuacion;
}
