package com.newlife.apinewlife.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlife.apinewlife.data.entidades.HclinicaEntity;
import com.newlife.apinewlife.data.repositorios.IHclinicaRepository;
import com.newlife.apinewlife.shared.HclinicaDto;

@Service
public class HclinicaService implements IHclinicaService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IHclinicaRepository iHclinicaRepository;

    @Override
    public HclinicaDto crearHclinica(HclinicaDto hclinicacrearDto) {

        HclinicaEntity hclinicaEntityDto = modelMapper.map(hclinicacrearDto, HclinicaEntity.class);
        hclinicaEntityDto.setIdHclinica(UUID.randomUUID().toString());

        HclinicaEntity hclinicaEntity= iHclinicaRepository.save(hclinicaEntityDto);

        HclinicaDto hclinicaDto = modelMapper.map(hclinicaEntity, HclinicaDto.class);

        return hclinicaDto;
    }

    @Override
    public HclinicaDto leerHclinica(String notasMedicas) {
        
    HclinicaEntity hclinicaEntity = iHclinicaRepository.findBynotasMedicas(notasMedicas);

    return modelMapper.map(hclinicaEntity, HclinicaDto.class);
    }
    
}
