package com.newlife.apinewlife.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.modelmapper.ModelMapper;
import com.newlife.apinewlife.models.peticiones.UsuarioCrearRequestModel;
import com.newlife.apinewlife.models.respuestas.UsuarioDataRestModel;
import com.newlife.apinewlife.services.IUsuarioService;
import com.newlife.apinewlife.shared.UsuarioDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;


    @GetMapping
    public UsuarioDataRestModel leerUsuario(){

        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();

        String username= authentication.getPrincipal().toString();    

        UsuarioDto usuarioDto= iUsuarioService.leerUsuario(username);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }


    @PostMapping
    public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel) {   

        UsuarioDto usuarioCrearDto= modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }


}