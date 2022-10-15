package com.unab.apinewlife.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.apinewlife.data.entidades.CitaEntity;
import com.unab.apinewlife.data.repositorios.ICitaRepository;
import com.unab.apinewlife.shared.CitaDto;

@Service
public class CitaService implements ICitaService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ICitaRepository iCitaRepository;

    @Override
    public CitaDto crearCita(CitaDto citaCrearDto) {

        if(iCitaRepository.findByCodigo(citaCrearDto.getCodigo()) != null) {
            throw new RuntimeException("Ya esta cita esta creada");
        }

        CitaEntity citaEntityDto= modelMapper.map(citaCrearDto, CitaEntity.class);
        citaEntityDto.setIdCita(UUID.randomUUID().toString());

        CitaEntity citaEntity= iCitaRepository.save(citaEntityDto);
        CitaDto citaDto= modelMapper.map(citaEntity, CitaDto.class);

       
        return citaDto;
    }

    @Override
    public CitaDto leerCita(String codigo) {
        CitaEntity citaEntity= iCitaRepository.findByCodigo(codigo);

        CitaDto citaDto= modelMapper.map(citaEntity, CitaDto.class);
        return citaDto;
    }

    
}
