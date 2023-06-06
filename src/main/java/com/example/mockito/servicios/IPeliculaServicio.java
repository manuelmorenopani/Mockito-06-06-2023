package com.example.mockito.servicios;

import com.example.mockito.modelos.Pelicula;

import java.util.List;

public interface IPeliculaServicio {

    List<Pelicula> ObtenerTodos();

    Pelicula crearPelicula(Pelicula pelicula);
    Pelicula mostrarUno(int id);
}
