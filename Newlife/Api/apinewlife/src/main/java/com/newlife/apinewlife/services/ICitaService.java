package com.newlife.apinewlife.services;

import com.newlife.apinewlife.shared.CitaDto;

public interface ICitaService {

    public CitaDto crearCita(CitaDto citaCrearDto);
    public CitaDto leerCita(String codigo);


}
