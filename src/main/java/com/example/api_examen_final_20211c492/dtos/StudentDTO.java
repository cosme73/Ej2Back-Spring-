package com.example.api_examen_final_20211c492.dtos;

import com.example.api_examen_final_20211c492.entities.University;

import javax.persistence.*;

public class StudentDTO {

    private Long ycqtId;
    private String ycqtCode;
    private String ycqtName;
    private double ycqtWeightedAverage;
    private University ycqtUniversity;

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
