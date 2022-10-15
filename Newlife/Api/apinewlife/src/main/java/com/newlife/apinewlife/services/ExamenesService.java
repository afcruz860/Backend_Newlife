package com.newlife.apinewlife.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlife.apinewlife.data.entidades.ExamenesEntity;
import com.newlife.apinewlife.data.repositorios.IExamenesReporitory;
import com.newlife.apinewlife.shared.ExamenesDto;





@Service
public class ExamenesService implements IExamenesService {

    @Autowired
    ModelMapper modelMapper;


    @Autowired
    IExamenesReporitory iExamenesReporitory;
    //IExamenesService iExamenesRepository; aqui el error

    @Override
     public ExamenesDto crearExamen(ExamenesDto examenesCrearDTO) {


         if(iExamenesReporitory.findByCodigo(examenesCrearDTO.getCodigo()) !=null){
           // (iExamenesRepository.findByCodigo(examenesCrearDTO.getCodigo())!=null
            throw new RuntimeException("Este examen ya fue creado");
                    
        }

        

        ExamenesEntity examenesEntityDTO = modelMapper.map(examenesCrearDTO, ExamenesEntity.class);
        examenesEntityDTO.setIdCliente(UUID.randomUUID().toString());

        
        // ExamenesEntity examenesEntity= iExamenesRepository.save(examenesEntityDTO);en la anotacion estabas llamando al service y era al repositorio en la fila 26
        ExamenesEntity examenesEntity= iExamenesReporitory.save(examenesEntityDTO);

        ExamenesDto examenesDto= modelMapper.map(examenesEntity, ExamenesDto.class);
        
    
        return examenesDto;
    }

    @Override
    public ExamenesDto leerExamen(String codigo) {
        
        //ExamenesEntity examenesEntity = iExamenesRepository.findByCodigo(codigo);
        ExamenesEntity examenesEntity = iExamenesReporitory.findByCodigo(codigo);
        ExamenesDto examenesDto= modelMapper.map(examenesEntity, ExamenesDto.class);
        return examenesDto;
    }



 
    

    
}
