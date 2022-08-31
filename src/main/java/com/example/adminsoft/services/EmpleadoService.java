package com.example.adminsoft.services;

import com.example.adminsoft.models.Empleado;
import com.example.adminsoft.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

    public Empleado saveEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
}
