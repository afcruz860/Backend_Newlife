package com.newlife.apinewlife.services;

import com.newlife.apinewlife.shared.MedicamentoDto;

public interface IMedicamentoService{

    public MedicamentoDto crearMedicamento(MedicamentoDto medicamentoDto);

    public MedicamentoDto leerMedicamento(String codigo);

}
