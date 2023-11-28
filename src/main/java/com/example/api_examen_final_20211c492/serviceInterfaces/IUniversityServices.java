package com.example.api_examen_final_20211c492.serviceInterfaces;


import com.example.api_examen_final_20211c492.entities.Student;
import com.example.api_examen_final_20211c492.entities.University;

import java.util.List;

public interface IUniversityServices {

    //CRUD
    public void insert(University ycqtstudent);
    public List<University> listAllUniversity();

    public void delete(Long ycqtid);
    public University getUniversity(Long ycqtid);


}
