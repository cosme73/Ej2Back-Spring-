package com.example.api_examen_final_20211c492.serviceImplements;

import com.example.api_examen_final_20211c492.entities.Student;
import com.example.api_examen_final_20211c492.repositories.StudentRepository;
import com.example.api_examen_final_20211c492.serviceInterfaces.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImplements implements IStudentServices {

    @Autowired
    private StudentRepository ycqtstudentRepository;

    @Override
    public void insert(Student ycqtstudent) {
        ycqtstudentRepository.save(ycqtstudent);
    }

    @Override
    public List<Student> listAllStudents() {
        return ycqtstudentRepository.findAll();
    }

    @Override
    public void delete(Long ycqtid) {
        ycqtstudentRepository.deleteById(ycqtid);
    }

    @Override
    public Student getStudent(Long ycqtid) {
        return ycqtstudentRepository.findById(ycqtid).orElse(null);
    }

    @Override
    public List<Student> listStudentsByWeightedAverage(double WeightedAverage) {
        return ycqtstudentRepository.listStudentsByWeightedAverage(WeightedAverage);
    }
}
