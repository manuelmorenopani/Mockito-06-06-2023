package com.example.mockito.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer peliculaID;
    @Column(length=60, nullable = false)
    private String titulo;
    @Column(length=600, nullable = false)
    private String sinopsis;
    @Column(length=20, nullable = false)
    private String clasificacion;
    @Column(length=60)
    private String urlImagen;
}
