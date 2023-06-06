package com.example.mockito.repositorio;


import com.example.mockito.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IPeliculaRepo extends JpaRepository<Pelicula,Integer> {


    }

