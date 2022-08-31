package com.example.adminsoft.controllers;

import com.example.adminsoft.models.Empleado;
import com.example.adminsoft.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ArrayList<Empleado> getEmpleados(){
        return empleadoService.getEmpleados();
    }

    @PostMapping()
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        empleado.setFecha_hora_crea(new Date());
        return this.empleadoService.saveEmpleado(empleado);
    }

}
