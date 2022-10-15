package com.newlife.apinewlife.data.repositorios;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.newlife.apinewlife.data.entidades.ExamenesEntity;

@Repository
public interface IExamenesReporitory extends CrudRepository<ExamenesEntity, Long> {

    public ExamenesEntity findByCodigo(String codigo);
}
