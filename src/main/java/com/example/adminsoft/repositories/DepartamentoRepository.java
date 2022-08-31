package com.example.adminsoft.repositories;

import com.example.adminsoft.models.Departamento;
import com.example.adminsoft.models.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
}
