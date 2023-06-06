package com.example.mockito.repositorio;

import com.example.mockito.modelos.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface IPeliculasRepo extends JpaRepository<Peliculas,Integer> {

    }

