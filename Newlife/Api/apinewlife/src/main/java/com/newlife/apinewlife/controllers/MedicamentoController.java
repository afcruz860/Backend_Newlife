package com.newlife.apinewlife.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.newlife.apinewlife.models.peticiones.MedicamentoCrearRequestModel;
import com.newlife.apinewlife.models.respuestas.MedicamentoDatarestModel;
import com.newlife.apinewlife.services.IMedicamentoService;
import com.newlife.apinewlife.shared.MedicamentoDto;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IMedicamentoService iMedicamentoService;

    @GetMapping
    public MedicamentoDatarestModel leerMedicamento(){
        String codigo = "12634";
        MedicamentoDto medicamentoDto = iMedicamentoService.leerMedicamento(codigo);
        MedicamentoDatarestModel medicamentoDatarestModel = modelMapper.map(medicamentoDto, MedicamentoDatarestModel.class);

        return medicamentoDatarestModel;

    } 

    @PostMapping
    public MedicamentoDatarestModel crearMedicamento(@RequestBody MedicamentoCrearRequestModel medicamentoCrearRequestModel){
        MedicamentoDto medicamentoCrearDto = modelMapper.map(medicamentoCrearRequestModel, MedicamentoDto.class);
        MedicamentoDto medicamentoDto = iMedicamentoService.crearMedicamento(medicamentoCrearDto);
        MedicamentoDatarestModel medicamentoDatarestModel = modelMapper.map(medicamentoDto, MedicamentoDatarestModel.class);


        return medicamentoDatarestModel;

    } 


}
