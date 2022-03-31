package com.usta.crudspring.rest;

import com.usta.crudspring.model.Facultad;
import com.usta.crudspring.servicios.facultadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facultad")
public class FacultadRest {
    @Autowired//Le dice al programa que existe una entidad, repo, y un servicio
    private facultadServicio facultadServicio;

    @GetMapping("listarFacultades")//ruta personalisada
    private ResponseEntity<List<Facultad>>listarFacultad(){
        return ResponseEntity.ok(facultadServicio.getAllFacultad());
    }

    @PostMapping("/crear")
    private ResponseEntity<Facultad> guardarFacultad(@RequestBody Facultad facultad){
        Facultad temporal = facultadServicio.crearFacultad(facultad);
        try {
            return ResponseEntity.created(new URI("/api/facultad/"+temporal.getCodFacultad())).body(facultad);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "listar/{id}")
    private ResponseEntity<Optional<Facultad>> listarFacultadById(@PathVariable("id")Long id){
        return ResponseEntity.ok(facultadServicio.findByIdFacultad(id));
    }

}
