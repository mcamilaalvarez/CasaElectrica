package com.egg.electricidad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egg.electricidad.entidades.Articulo;

@Repository
public interface ArticuloRepositorio extends JpaRepository<Articulo,String> {
    
}
