package co.juan.plazacomidas.api.utils;

import co.juan.plazacomidas.api.dto.TrazabilidadRequestDto;
import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;

public interface TrazabilidadMapper {

    Trazabilidad toTrazabilidad(TrazabilidadRequestDto requestDto);
}
