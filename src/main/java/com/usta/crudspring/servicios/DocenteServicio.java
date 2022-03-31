package com.usta.crudspring.servicios;

import com.usta.crudspring.model.Docente;
import com.usta.crudspring.repositorios.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServicio {
    @Autowired
    private DocenteRepositorio docenteRepositorio;

    public List<Docente> getAllDocentes(){
        return docenteRepositorio.findAll();
    }




}
