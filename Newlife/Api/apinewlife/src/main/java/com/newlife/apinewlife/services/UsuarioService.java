package com.newlife.apinewlife.services;

import java.util.ArrayList;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.newlife.apinewlife.data.entidades.UsuarioEntity;
import com.newlife.apinewlife.data.repositorios.IUsuariorepository;
import com.newlife.apinewlife.shared.UsuarioDto;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuariorepository iUsuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto) {

        if(iUsuarioRepository.findByEmail(usuarioCrearDto.getEmail()) !=null){
            throw new RuntimeException("Este correo ya se encuentra registrado");
        }

        if(iUsuarioRepository.findByUsername(usuarioCrearDto.getUsername()) !=null){
            throw new RuntimeException("Este usuario ya esta en uso");
        }

        UsuarioEntity usuarioEntityDto= modelMapper.map(usuarioCrearDto, UsuarioEntity.class);
        usuarioEntityDto.setIdUsuario(UUID.randomUUID().toString());
        usuarioEntityDto.setPasswordEncriptada(bCryptPasswordEncoder.encode(usuarioCrearDto.getPassword()));

        UsuarioEntity usuarioEntity= iUsuarioRepository.save(usuarioEntityDto);

        UsuarioDto usuarioDto= modelMapper.map(usuarioEntity, UsuarioDto.class);

        return usuarioDto;
    }

    @Override
    public UsuarioDto leerUsuario(String username) {

        UsuarioEntity usuarioEntity= iUsuarioRepository.findByUsername(username);

        if(usuarioEntity==null){
            throw new UsernameNotFoundException(username);
        }

        UsuarioDto usuarioDto= modelMapper.map(usuarioEntity, UsuarioDto.class);

        return usuarioDto;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsuarioEntity usuarioEntity= iUsuarioRepository.findByUsername(username);

        if(usuarioEntity==null){
            throw new UsernameNotFoundException(username);
        }

        User usuario= new User(usuarioEntity.getUsername(), usuarioEntity.getPasswordEncriptada(), new ArrayList<>());

        return usuario;
    }

}
