package com.example.api_examen_final_20211c492.serviceImplements;

import com.example.api_examen_final_20211c492.entities.University;
import com.example.api_examen_final_20211c492.repositories.UniversityRepository;
import com.example.api_examen_final_20211c492.serviceInterfaces.IUniversityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityImplements implements IUniversityServices {
    @Autowired
    private UniversityRepository ycqtuniversityRepository;

    @Override
    public void insert(University ycqtstudent) {
        ycqtuniversityRepository.save(ycqtstudent);
    }

    @Override
    public List<University> listAllUniversity() {
        return ycqtuniversityRepository.findAll();
    }

    @Override
    public void delete(Long ycqtid) {
        ycqtuniversityRepository.deleteById(ycqtid);
    }

    @Override
    public University getUniversity(Long ycqtid) {
        return ycqtuniversityRepository.findById(ycqtid).orElse(null);
    }
}
