package com.example.adminsoft.controllers;

import com.example.adminsoft.models.Departamento;
import com.example.adminsoft.models.Empleado;
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

    @PutMapping(path = "/{id}")
    public Departamento updateEmpleado(@PathVariable(value = "id") Long empleadoId, @RequestBody Departamento departamento) {
        departamento.setId(empleadoId);
        departamento.setFecha_hora_modifica(new Date());
        Departamento updatedDepartamento = departamentoService.saveDepartamento(departamento);
        return updatedDepartamento;
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.departamentoService.deleteEmpleado(id);
        if (ok){
            return "Se eliminó el departamento con id " + id;
        }else{
            return "No pudo eliminar el departamento con id" + id;
        }
    }
}
