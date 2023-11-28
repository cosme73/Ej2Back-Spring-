package com.example.api_examen_final_20211c492.repositories;

import com.example.api_examen_final_20211c492.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Rol, Long> {
}
