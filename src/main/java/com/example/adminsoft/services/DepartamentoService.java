package com.example.adminsoft.services;

import com.example.adminsoft.models.Departamento;
import com.example.adminsoft.models.Empleado;
import com.example.adminsoft.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public ArrayList<Departamento> getDepartamentos() {
        return (ArrayList<Departamento>) departamentoRepository.findAll();
    }

    public Departamento saveDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
}
