package com.newlife.apinewlife.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.newlife.apinewlife.shared.UsuarioDto;

public interface IUsuarioService extends UserDetailsService{

    UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto);

    UsuarioDto leerUsuario(String username);
}
