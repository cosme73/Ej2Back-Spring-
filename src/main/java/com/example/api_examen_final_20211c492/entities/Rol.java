package com.example.api_examen_final_20211c492.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RolUsuario")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ycqtid;

    private String ycqtrol;

    public Rol() {
    }

    public Rol(Long ycqtid, String ycqtrol) {
        this.ycqtid = ycqtid;
        this.ycqtrol = ycqtrol;
    }

    public Long getYcqtid() {
        return ycqtid;
    }

    public void setYcqtid(Long ycqtid) {
        this.ycqtid = ycqtid;
    }

    public String getYcqtrol() {
        return ycqtrol;
    }

    public void setYcqtrol(String ycqtrol) {
        this.ycqtrol = ycqtrol;
    }
}
