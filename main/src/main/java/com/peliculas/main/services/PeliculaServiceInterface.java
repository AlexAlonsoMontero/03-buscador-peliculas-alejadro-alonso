package com.peliculas.main.services;

import java.util.List;

import com.peliculas.main.model.Pelicula;

public interface PeliculaServiceInterface {
    List<Pelicula> getPeliculas(String query);
}
