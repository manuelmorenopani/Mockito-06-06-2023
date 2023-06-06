package com.example.mockito.controlador;

import com.example.mockito.modelos.Pelicula;
import com.example.mockito.servicios.IPeliculaServicio;
import com.example.mockito.servicios.PeliculaServicioimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
    @Autowired
    private IPeliculaServicio service;

    @GetMapping("/{idPelicula}")
    public ResponseEntity<Pelicula> getPeliculaById(int idPelicula) throws Exception {
        Pelicula peli = service.mostrarUno(idPelicula);
        return ResponseEntity.ok(peli);
    }

    @PostMapping("/create")
    public ResponseEntity<Pelicula> createPelicula(Pelicula pelicula) throws Exception {
        return ResponseEntity.ok(service.crearPelicula(pelicula));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pelicula>> getPeliculas() throws Exception {
        List<Pelicula> peliculas = service.ObtenerTodos();
        return ResponseEntity.ok(peliculas);
    }

}