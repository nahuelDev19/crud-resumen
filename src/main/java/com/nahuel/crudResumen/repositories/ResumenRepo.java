package com.nahuel.crudResumen.repositories;

import com.nahuel.crudResumen.entitys.Resumen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ResumenRepo extends JpaRepository<Resumen, UUID> {

    Optional<Resumen> findByNombre(String nombre);
    void deleteByNombre(String nombre);


}
