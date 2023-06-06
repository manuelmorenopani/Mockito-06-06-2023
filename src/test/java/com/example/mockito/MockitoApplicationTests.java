package com.example.mockito;

import com.example.mockito.modelos.Pelicula;
import com.example.mockito.repositorio.IPeliculaRepo;
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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class MockitoApplicationTests {
    @Test
    void contextLoads() {
    }

}