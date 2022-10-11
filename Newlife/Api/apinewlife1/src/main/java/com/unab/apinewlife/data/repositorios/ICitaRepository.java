package com.unab.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.apinewlife.data.entidades.CitaEntity;

@Repository
public interface ICitaRepository extends CrudRepository<CitaEntity, Long> {

    public CitaEntity findByCodigo(String codigo);
    
}
