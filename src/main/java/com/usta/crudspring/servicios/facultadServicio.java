package com.usta.crudspring.servicios;

import com.usta.crudspring.model.Facultad;
import com.usta.crudspring.repositorios.facultadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class facultadServicio {
    @Autowired
    private facultadRepositorio facultadRepositorio;

    public List<Facultad> getAllFacultad(){
        return facultadRepositorio.findAll();
    }

    public Facultad crearFacultad(Facultad facultad){
        return facultadRepositorio.save(facultad);
    }


    public Optional<Facultad> findByIdFacultad(Long id){
        return facultadRepositorio.findById(id);
    }
}
