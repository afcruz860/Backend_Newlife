package com.newlife.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newlife.apinewlife.data.entidades.UsuarioEntity;


@Repository
public interface IUsuariorepository extends CrudRepository<UsuarioEntity, Long>{

    UsuarioEntity findByEmail(String email);
    UsuarioEntity findByUsername(String username);

}
