package com.example.adminsoft.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String departamento_codigo;
    private String departamento_nombre;
    private Date fecha_hora_crea;
    private Date fecha_hora_modifica;

    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartamento_codigo() {
        return departamento_codigo;
    }

    public void setDepartamento_codigo(String departamento_codigo) {
        this.departamento_codigo = departamento_codigo;
    }

    public String getDepartamento_nombre() {
        return departamento_nombre;
    }

    public void setDepartamento_nombre(String departamento_nombre) {
        this.departamento_nombre = departamento_nombre;
    }

    public Date getFecha_hora_crea() {
        return fecha_hora_crea;
    }

    public void setFecha_hora_crea(Date fecha_hora_crea) {
        this.fecha_hora_crea = fecha_hora_crea;
    }

    public Date getFecha_hora_modifica() {
        return fecha_hora_modifica;
    }

    public void setFecha_hora_modifica(Date fecha_hora_modifica) {
        this.fecha_hora_modifica = fecha_hora_modifica;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
