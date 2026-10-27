package com.peliculas.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.peliculas.main.model.Pelicula;
import com.peliculas.main.services.PeliculaService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
public class PeliculaController {
    PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("peliculas")
    public ResponseEntity<List<Pelicula>> peliculas(@RequestParam String peliculas) {
        return ResponseEntity.ok(peliculaService.getPeliculas(peliculas));
    }

}
