package com.example.api_examen_final_20211c492.serviceInterfaces;

import com.example.api_examen_final_20211c492.entities.Student;

import java.util.List;

public interface IStudentServices {


    //CRUD
    public void insert(Student ycqtstudent);
    public List<Student> listAllStudents();

    public void delete(Long ycqtid);
    public Student getStudent(Long ycqtid);


    public List<Student> listStudentsByWeightedAverage(double WeightedAverage);

}
