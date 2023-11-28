package com.example.api_examen_final_20211c492.repositories;

import com.example.api_examen_final_20211c492.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByYcqtNombreUsuario(String ycqtNombreUsuario);


}
