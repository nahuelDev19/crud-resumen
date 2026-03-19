package com.nahuel.crudResumen.controller;

import com.nahuel.crudResumen.entitys.Resumen;
import com.nahuel.crudResumen.services.ResumenI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resumen/api")
public class ResumenController {

    private ResumenI resumenService;

    public ResumenController(ResumenI resumenService) {
        this.resumenService = resumenService;
    }


    @PostMapping("/guardar")
    public ResponseEntity<Resumen> guardar(@RequestBody Resumen resumen){
        return ResponseEntity.ok(resumenService.create(resumen));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Resumen>> listar(){
        return ResponseEntity.ok(resumenService.findAll());
    }


    @GetMapping("/buscar/{nombre}")
    public ResponseEntity<Optional<Resumen>> buscar(@PathVariable String nombre){
        return ResponseEntity.ok(resumenService.findByNameResumen(nombre));
    }
    @DeleteMapping("/delete/{nombre}")
    public ResponseEntity<Void> eliminar(@PathVariable String nombre){
        resumenService.delete(nombre);
        return ResponseEntity.noContent().build();
    }

}
