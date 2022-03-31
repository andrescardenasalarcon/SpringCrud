package com.usta.crudspring.rest;


import com.usta.crudspring.model.Docente;
import com.usta.crudspring.servicios.DocenteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/docente/")
public class DocenteRest {

    @Autowired
    private DocenteServicio docenteServicio;

    @GetMapping("/listar")
    private ResponseEntity<List<Docente>> listarTodosLosDocentes(){
        return ResponseEntity.ok(docenteServicio.getAllDocentes());
    }


}
