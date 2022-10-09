package com.newlife.apinewlife.services;

import com.newlife.apinewlife.shared.HclinicaDto;

public interface IHclinicaService {
    
    public HclinicaDto crearHclinica(HclinicaDto hclinicacrearDto);

    public HclinicaDto leerHclinica(String notasMedicas);
}
