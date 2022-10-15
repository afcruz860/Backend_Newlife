package com.newlife.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newlife.apinewlife.data.entidades.MedicamentoEntity;

@Repository
public interface IMedicamentoRepository extends CrudRepository<MedicamentoEntity, Long>{

    public MedicamentoEntity findByCodigo (String codigo);
    
}
