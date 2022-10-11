package com.unab.apinewlife.services;

import com.unab.apinewlife.shared.CitaDto;

public interface ICitaService {

    public CitaDto crearCita(CitaDto citaCrearDto);
    public CitaDto leerCita(String codigo);

    
}
