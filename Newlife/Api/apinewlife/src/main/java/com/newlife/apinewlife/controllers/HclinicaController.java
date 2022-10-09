package com.newlife.apinewlife.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlife.apinewlife.models.peticiones.HclinicaCrearRequestModel;
import com.newlife.apinewlife.models.respuestas.HclinicaDataRestModel;
import com.newlife.apinewlife.services.IHclinicaService;
import com.newlife.apinewlife.shared.HclinicaDto;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/hclinica")
public class HclinicaController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IHclinicaService iHclinicaService;

    @GetMapping
    public HclinicaDataRestModel leerHclinica(){

        String notasMedicas="Paciente esta bien";

        HclinicaDto hclinicaDto = iHclinicaService.leerHclinica(notasMedicas);

        HclinicaDataRestModel hclinicaDataRestModel = modelMapper.map(iHclinicaService, HclinicaDataRestModel.class);

    return hclinicaDataRestModel;
    } 
    
    @PostMapping
    public HclinicaDataRestModel crearHclinica(@RequestBody HclinicaCrearRequestModel hclinicaCrearRequestModel){

        
        HclinicaDto hclinicacrearDto = modelMapper.map(hclinicaCrearRequestModel, HclinicaDto.class);

        HclinicaDto hclinicaDto= iHclinicaService.crearHclinica(hclinicacrearDto);

        return modelMapper.map(hclinicaDto, HclinicaDataRestModel.class);
    }
}
