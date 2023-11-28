package com.example.api_examen_final_20211c492.Controllers;

import com.example.api_examen_final_20211c492.dtos.UniversityDTO;
import com.example.api_examen_final_20211c492.entities.University;
import com.example.api_examen_final_20211c492.serviceInterfaces.IStudentServices;
import com.example.api_examen_final_20211c492.serviceInterfaces.IUniversityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.List;


@RestController
@RequestMapping("/university")
public class UniversityController {
    @Autowired
    private IUniversityServices ycqtuniversityServices;

    @PostMapping
    public void save(@RequestBody UniversityDTO ycqtDTO) {
        ModelMapper ycqtmodelMapper = new ModelMapper();
        University ycqtuniveristy = ycqtmodelMapper.map(ycqtDTO, University.class);
        ycqtuniversityServices.insert(ycqtuniveristy);
    }
    @GetMapping
    public List<UniversityDTO> list() {
        return ycqtuniversityServices.listAllUniversity().stream().map(ycqtx->{
            ModelMapper ycqtmodelMapper = new ModelMapper();
            return ycqtmodelMapper.map(ycqtx, UniversityDTO.class);
        }).collect(java.util.stream.Collectors.toList());

    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UniversityDTO ycqtDTO, @PathVariable("id") Long ycqtid) {
        ModelMapper ycqtmodelMapper = new ModelMapper();
        University ycqtstudent = ycqtmodelMapper.map(ycqtDTO, University.class);
        ycqtuniversityServices.insert(ycqtstudent);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long ycqtid) {
        ycqtuniversityServices.delete(ycqtid);
    }
}
