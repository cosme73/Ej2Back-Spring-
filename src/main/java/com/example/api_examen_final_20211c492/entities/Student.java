package com.example.api_examen_final_20211c492.entities;


import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Student")
public class Student implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ycqtId;
    @Column(length = 30, unique = true)
    private String ycqtCode;
    @Column(name = "ycqtName", length = 100, nullable = false)
    private String ycqtName;
    @Column(name = "ycqtWeightedAverage", length = 100, nullable = false)
    private double ycqtWeightedAverage;

    @ManyToOne
    @JoinColumn(name = "ycqtUniversity", nullable = false)
    private University ycqtUniversity;

    public Student() {
    }
    public Student(Long ycqtId, String ycqtCode, String ycqtName, double ycqtWeightedAverage, University ycqtUniversity) {
        this.ycqtId = ycqtId;
        this.ycqtCode = ycqtCode;
        this.ycqtName = ycqtName;
        this.ycqtWeightedAverage = ycqtWeightedAverage;
        this.ycqtUniversity = ycqtUniversity;
    }

    public Long getYcqtId() {
        return ycqtId;
    }

    public void setYcqtId(Long ycqtId) {
        this.ycqtId = ycqtId;
    }

    public String getYcqtCode() {
        return ycqtCode;
    }

    public void setYcqtCode(String ycqtCode) {
        this.ycqtCode = ycqtCode;
    }

    public String getYcqtName() {
        return ycqtName;
    }

    public void setYcqtName(String ycqtName) {
        this.ycqtName = ycqtName;
    }

    public double getYcqtWeightedAverage() {
        return ycqtWeightedAverage;
    }

    public void setYcqtWeightedAverage(double ycqtWeightedAverage) {
        this.ycqtWeightedAverage = ycqtWeightedAverage;
    }

    public University getYcqtUniversity() {
        return ycqtUniversity;
    }

    public void setYcqtUniversity(University ycqtUniversity) {
        this.ycqtUniversity = ycqtUniversity;
    }
}
