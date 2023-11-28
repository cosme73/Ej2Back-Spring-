package com.example.api_examen_final_20211c492.Controllers;

import com.example.api_examen_final_20211c492.dtos.StudentDTO;

import com.example.api_examen_final_20211c492.entities.Student;

import com.example.api_examen_final_20211c492.serviceInterfaces.IStudentServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private IStudentServices ycqtstudentServices;

    @PostMapping
    public void save(@RequestBody StudentDTO ycqtDTO) {
        ModelMapper ycqtmodelMapper = new ModelMapper();
        Student ycqtstudent = ycqtmodelMapper.map(ycqtDTO, Student.class);
        ycqtstudentServices.insert(ycqtstudent);
    }

    @GetMapping
    public List<StudentDTO> list() {
        return ycqtstudentServices.listAllStudents().stream().map(ycqtx->{
            ModelMapper ycqtmodelMapper = new ModelMapper();
            return ycqtmodelMapper.map(ycqtx, StudentDTO.class);
        }).collect(java.util.stream.Collectors.toList());

    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody StudentDTO ycqtDTO, @PathVariable("id") Long ycqtid) {
        ModelMapper ycqtmodelMapper = new ModelMapper();
        Student ycqtstudent = ycqtmodelMapper.map(ycqtDTO, Student.class);
        ycqtstudentServices.insert(ycqtstudent);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long ycqtid) {
        ycqtstudentServices.delete(ycqtid);
    }

    /*
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/listStudentsByWeightedAverage/{WeightedAverage}")
    public List<StudentDTO> listStudentsByWeightedAverage(@PathVariable("WeightedAverage") double WeightedAverage) {
        return ycqtstudentServices.listStudentsByWeightedAverage(WeightedAverage).stream().map(ycqtx->{
            ModelMapper ycqtmodelMapper = new ModelMapper();
            return ycqtmodelMapper.map(ycqtx, StudentDTO.class);
        }).collect(Collectors.toList());
    }*/

    @GetMapping("/listStudentsByWeightedAverage/{WeightedAverage}")
    public List<StudentDTO> listStudentsByWeightedAverage(@PathVariable("WeightedAverage") double weightedAverage) {
        List<Student> students = ycqtstudentServices.listStudentsByWeightedAverage(weightedAverage);
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student data : students) {
            StudentDTO dto = new StudentDTO();
            dto.setYcqtId(data.getYcqtId());
            dto.setYcqtName(data.getYcqtName());
            dto.setYcqtWeightedAverage(data.getYcqtWeightedAverage());
            dto.setYcqtUniversity(data.getYcqtUniversity());
            studentDTOs.add(dto);
        }
        return studentDTOs;
    }




}
