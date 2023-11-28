package com.example.api_examen_final_20211c492.repositories;

import com.example.api_examen_final_20211c492.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//o	HUL01: Como usuario quiero listar estudiantes con promedio ponderado mayor o igual a una calificación dada ordenados alfabéticamente por nombre para gestionarlos
 @Query(value = "select * from student where ycqt_weighted_average >= :weighted_average order by  ycqt_weighted_average asc", nativeQuery = true)
   public List<Student> listStudentsByWeightedAverage(@Param("weighted_average")double weighted_average);
}
