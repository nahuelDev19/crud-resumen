package com.nahuel.crudResumen.services;

import com.nahuel.crudResumen.entitys.Resumen;
import com.nahuel.crudResumen.repositories.ResumenRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @Transactional
public class ResumenImp implements ResumenI{

    private ResumenRepo resumenRepo;

    public ResumenImp(ResumenRepo resumenRepo) {
        this.resumenRepo = resumenRepo;
    }

    @Override
    public List<Resumen> findAll() {
        return resumenRepo.findAll();
    }

    @Override
    public Resumen create(Resumen resumen) {
        return resumenRepo.save(resumen);
    }

    @Override
    public Optional<Resumen> findByNameResumen(String nombre) {
        return resumenRepo.findByNombre(nombre);
    }

    @Override
    public void delete(String nombre) {
        resumenRepo.deleteByNombre(nombre);
    }
}
