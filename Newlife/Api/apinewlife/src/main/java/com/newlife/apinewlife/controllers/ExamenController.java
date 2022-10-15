package com.newlife.apinewlife.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlife.apinewlife.models.peticiones.ExamenesCrearRequestModel;
import com.newlife.apinewlife.models.respuestas.ExamenesDataRestModel;
import com.newlife.apinewlife.services.IExamenesService;
import com.newlife.apinewlife.shared.ExamenesDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/examenes")
public class ExamenController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IExamenesService iExamenesService;


    

    @GetMapping
    public ExamenesDataRestModel leerExamen(){

            String codigo= "1234567";
            ExamenesDto examenesDto= iExamenesService.leerExamen(codigo);

           // ExamenesDto examenesDto= IExamenesService.leerExamen(codigo);los objetos se llaman con la primera letra en minuscula.

            ExamenesDataRestModel examenesDataRestModel = modelMapper.map(examenesDto, ExamenesDataRestModel.class);


        return examenesDataRestModel;
    }


    @PostMapping
    public ExamenesDataRestModel crearExamen (@RequestBody ExamenesCrearRequestModel examenesCrearRequestModel){

        ExamenesDto examenesCrearDTO= modelMapper.map(examenesCrearRequestModel, ExamenesDto.class);
        ExamenesDto examenesDto= iExamenesService.crearExamen(examenesCrearDTO);
        ExamenesDataRestModel examenesDataRestModel= modelMapper.map(examenesDto, ExamenesDataRestModel.class);

         return examenesDataRestModel;

    }
}
