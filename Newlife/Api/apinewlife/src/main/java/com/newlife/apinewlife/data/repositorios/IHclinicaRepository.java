package com.newlife.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.newlife.apinewlife.data.entidades.HclinicaEntity;

@Repository
public interface IHclinicaRepository extends CrudRepository<HclinicaEntity, Long> {

    public HclinicaEntity findBynotasMedicas(String notasMedicas);
    
}
