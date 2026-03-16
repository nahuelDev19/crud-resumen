package com.nahuel.crudResumen.services;

import com.nahuel.crudResumen.entitys.Resumen;

import java.util.List;
import java.util.Optional;

public interface ResumenI {


    List<Resumen> findAll();
    Resumen create(Resumen resumen);
    Optional<Resumen> findByNameResumen(String nombre);
    void delete (String nombre);


}
