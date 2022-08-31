package com.example.adminsoft.services;

import com.example.adminsoft.models.Departamento;
import com.example.adminsoft.models.Empleado;
import com.example.adminsoft.repositories.DepartamentoRepository;

import java.util.ArrayList;

public class DepartamentoService {

    DepartamentoRepository departamentoRepository;

    public ArrayList<Departamento> getDepartamentos() {
        return (ArrayList<Departamento>) departamentoRepository.findAll();
    }
}
