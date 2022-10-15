package com.newlife.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newlife.apinewlife.data.entidades.CitaEntity;

@Repository
public interface ICitaRepository extends CrudRepository<CitaEntity, Long> {

    public CitaEntity findByCodigo(String codigo);

}
