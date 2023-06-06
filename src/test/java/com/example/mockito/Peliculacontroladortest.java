package com.example.mockito;

import com.example.mockito.controlador.PeliculaController;
import com.example.mockito.modelos.Pelicula;
import com.example.mockito.servicios.PeliculaServicioimpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@ExtendWith(MockitoExtension.class)
public class Peliculacontroladortest {
    @Mock
    private PeliculaServicioimpl service;

    @InjectMocks
    private PeliculaController controller;

    @DisplayName("Test getPeliculaById")
    @Test
    public void testGetPeliculaById() throws Exception {
        Pelicula salida = new Pelicula(1, "Pelicula 1", "Sinopsis", "url");

        Mockito.when(service.getPeliculaById(Mockito.anyInt())).thenReturn(salida);

        final ResponseEntity<Pelicula> response = controller.getPeliculaById(1);
        Pelicula resultado = response.getBody();
        Assertions.assertEquals(salida, resultado);

    }

    @DisplayName("Test createPelicula")
    @Test
    public void testCreatePelicula() throws Exception {
        Pelicula entrada = new Pelicula(1, "Pelicula 1", "Sinopsis", "url");

        Mockito.when(service.crearPelicula(Mockito.any(Pelicula.class))).thenReturn(entrada);
        final ResponseEntity<Pelicula> response = controller.createPelicula(entrada);
        Pelicula resultado = response.getBody();
        Mockito.verify(service).(entrada);
    }

    @DisplayName("Test getPeliculas")
    @Test
    public void testGetPeliculas() throws Exception {
        List<Pelicula> peliculas = List.of(
                new Pelicula(1, "Pelicula 1", "Sinopsis", "url"),
                new Pelicula(2, "Pelicula 2", "Sinopsis", "url"),
                new Pelicula(3, "Pelicula 3", "Sinopsis", "url")
        );

        Mockito.when(service.getPelicula()).thenReturn(peliculas);
        final ResponseEntity<List<Pelicula>> response = controller.getPeliculas();
        Object resultado = response.getBody();
        assertThat(resultado).isInstanceOf(List.class);

        List<Pelicula> listaPeliculas = (List<Pelicula>) resultado;
        assertThat(listaPeliculas.size()).isEqualTo(3);
        assertThat(((List<Pelicula>)response.getBody()).size()).isEqualTo(3);

    }


}