package com.usta.crudspring.repositorios;

import com.usta.crudspring.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepositorio extends JpaRepository<Docente,Long> {

}
