package com.newlife.apinewlife.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlife.apinewlife.data.entidades.MedicamentoEntity;
import com.newlife.apinewlife.data.repositorios.IMedicamentoRepository;
import com.newlife.apinewlife.shared.MedicamentoDto;

@Service
public class MedicamentoService implements IMedicamentoService {
    
    @Autowired
    ModelMapper modelMapper;
    
    @Autowired
    IMedicamentoRepository iMedicamentoRepository;

    @Override
    public MedicamentoDto crearMedicamento (MedicamentoDto medicamentoCrearDto) {

        if (iMedicamentoRepository.findByCodigo(medicamentoCrearDto.getCodigo()) != null){
            throw new RuntimeException ("Este codigo ya se encuentra registrado");
        }

        MedicamentoEntity medicamentoEntityDto= modelMapper.map(medicamentoCrearDto, MedicamentoEntity.class);
        medicamentoEntityDto.setIdMedicamento(UUID.randomUUID().toString());
        MedicamentoEntity medicamentoEntity = iMedicamentoRepository.save(medicamentoEntityDto);

        MedicamentoDto medicamentoDto = modelMapper.map(medicamentoEntity, MedicamentoDto.class);

        return medicamentoDto;
    }

    @Override
    public MedicamentoDto leerMedicamento(String codigo) {
        MedicamentoEntity medicamentoEntity = iMedicamentoRepository.findByCodigo(codigo);

        MedicamentoDto medicamentoDto = modelMapper.map(medicamentoEntity, MedicamentoDto.class);

        return medicamentoDto;
    }     

 

}
