package com.example.adminsoft.controllers;

import com.example.adminsoft.models.Departamento;
import com.example.adminsoft.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping
    public ArrayList<Departamento> getEmpleados(){
        return departamentoService.getDepartamentos();
    }

    @PostMapping()
    public Departamento saveEmpleado(@RequestBody Departamento departamento){
        departamento.setFecha_hora_crea(new Date());
        return this.departamentoService.saveDepartamento(departamento);
    }
}
