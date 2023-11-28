package com.example.api_examen_final_20211c492.serviceImplements;


import com.example.api_examen_final_20211c492.entities.Rol;
import com.example.api_examen_final_20211c492.entities.Usuario;
import com.example.api_examen_final_20211c492.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//Clase 2
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository ycqtRepo;

    @Override
    public UserDetails loadUserByUsername(String ycqtNombreUsuario) throws UsernameNotFoundException {
        Usuario ycqtUser = ycqtRepo.findByYcqtNombreUsuario(ycqtNombreUsuario);

        if (ycqtUser == null) {
            throw new UsernameNotFoundException(String.format("User not exists", ycqtNombreUsuario));
        }

        List<GrantedAuthority> ycqtRoles = new ArrayList<>();

        Rol rol = ycqtUser.getYcqtRol();
        ycqtRoles.add(new SimpleGrantedAuthority(rol.getYcqtrol()));
        /*
        ycqtUser .getYcqtroles().forEach(rol -> {
            ycqtRoles .add(new SimpleGrantedAuthority(rol.getYcqtrol()));
        });
*/
        UserDetails ycqtUd = new org.springframework.security.core.userdetails.User(ycqtUser.getYcqtNombreUsuario(), ycqtUser.getYcqtClave(), ycqtUser.getYcqtHabilitado(), true, true, true, ycqtRoles);

        return ycqtUd;
    }
}