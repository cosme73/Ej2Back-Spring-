package com.example.api_examen_final_20211c492.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ycqtIdUsuario;
    @Column(length = 30, unique = true)
    private String ycqtNombreUsuario;
    @Column(length = 200)
    private String ycqtClave;
    private Boolean ycqtHabilitado;

    @Column(name = "ycqtNombres",length = 100,nullable = false)
    private String ycqtNombres;
    @Column(name = "ycqtCorreo",length = 150,nullable = false)
    private String ycqtCorreo;


    @ManyToOne
    @JoinColumn(name = "ycqtidRol",nullable = false)
    private Rol ycqtRol;
    public Usuario() {
    }

    public Usuario(Long ycqtIdUsuario, String ycqtNombreUsuario, String ycqtClave, Boolean ycqtHabilitado, String ycqtNombres, String ycqtCorreo, Rol ycqtRol) {
        this.ycqtIdUsuario = ycqtIdUsuario;
        this.ycqtNombreUsuario = ycqtNombreUsuario;
        this.ycqtClave = ycqtClave;
        this.ycqtHabilitado = ycqtHabilitado;
        this.ycqtNombres = ycqtNombres;
        this.ycqtCorreo = ycqtCorreo;
        this.ycqtRol = ycqtRol;
    }

    public Long getYcqtIdUsuario() {
        return ycqtIdUsuario;
    }

    public void setYcqtIdUsuario(Long ycqtIdUsuario) {
        this.ycqtIdUsuario = ycqtIdUsuario;
    }

    public String getYcqtNombreUsuario() {
        return ycqtNombreUsuario;
    }

    public void setYcqtNombreUsuario(String ycqtNombreUsuario) {
        this.ycqtNombreUsuario = ycqtNombreUsuario;
    }

    public String getYcqtClave() {
        return ycqtClave;
    }

    public void setYcqtClave(String ycqtClave) {
        this.ycqtClave = ycqtClave;
    }

    public Boolean getYcqtHabilitado() {
        return ycqtHabilitado;
    }

    public void setYcqtHabilitado(Boolean ycqtHabilitado) {
        this.ycqtHabilitado = ycqtHabilitado;
    }

    public String getYcqtNombres() {
        return ycqtNombres;
    }

    public void setYcqtNombres(String ycqtNombres) {
        this.ycqtNombres = ycqtNombres;
    }

    public String getYcqtCorreo() {
        return ycqtCorreo;
    }

    public void setYcqtCorreo(String ycqtCorreo) {
        this.ycqtCorreo = ycqtCorreo;
    }

    public Rol getYcqtRol() {
        return ycqtRol;
    }

    public void setYcqtRol(Rol ycqtRol) {
        this.ycqtRol = ycqtRol;
    }
}
