package com.example.adminsoft.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String documento_tipo;
    private Integer documento_numero;
    private String nombres;
    private String apellidos;
    private String departamentos_id;
    private String ciudad;
    private String direccion;
    private String correo_electronico;
    private Integer telefono;
    private Date fecha_hora_crea;
    private Date fecha_hora_modifica;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento_tipo() {
        return documento_tipo;
    }

    public void setDocumento_tipo(String documento_tipo) {
        this.documento_tipo = documento_tipo;
    }

    public Integer getDocumento_numero() {
        return documento_numero;
    }

    public void setDocumento_numero(Integer documento_numero) {
        this.documento_numero = documento_numero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDepartamentos_id() {
        return departamentos_id;
    }

    public void setDepartamentos_id(String departamentos_id) {
        this.departamentos_id = departamentos_id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
