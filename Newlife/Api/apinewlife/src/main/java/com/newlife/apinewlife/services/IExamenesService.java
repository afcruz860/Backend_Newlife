package com.newlife.apinewlife.services;


import com.newlife.apinewlife.shared.ExamenesDto;

public interface IExamenesService {
    
    public ExamenesDto crearExamen(ExamenesDto examenesDto);
    public ExamenesDto leerExamen(String codigo);
    



    }

