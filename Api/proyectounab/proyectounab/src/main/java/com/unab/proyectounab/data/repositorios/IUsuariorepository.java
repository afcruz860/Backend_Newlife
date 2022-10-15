package com.unab.proyectounab.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unab.proyectounab.data.entidades.Usuarioentity;

@Repository
public interface IUsuariorepository extends CrudRepository<Usuarioentity, Long>{

    Usuarioentity findByEmail(String email);
    Usuarioentity findByUsername(String username);
    
}
