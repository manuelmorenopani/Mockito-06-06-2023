package com.example.mockito.servicios;

import com.example.mockito.modelos.Pelicula;
import com.example.mockito.repositorio.IPeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServicioimpl implements IPeliculaServicio {
    @Autowired
    private IPeliculaRepo repo;

    @Override
    public List<Pelicula> ObtenerTodos() {return repo.findAll();}

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        return repo.save(pelicula);
    }

    @Override
    public Pelicula mostrarUno(int idPelicula){
        return repo.findById(idPelicula).orElse(null);
    }
}
