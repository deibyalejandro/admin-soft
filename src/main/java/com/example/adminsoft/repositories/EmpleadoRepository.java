package com.example.adminsoft.repositories;

import com.example.adminsoft.models.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

}
