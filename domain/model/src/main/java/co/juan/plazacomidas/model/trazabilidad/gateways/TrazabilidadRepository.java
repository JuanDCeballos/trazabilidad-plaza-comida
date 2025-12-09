package co.juan.plazacomidas.model.trazabilidad.gateways;

import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;

import java.util.List;

public interface TrazabilidadRepository {
    Trazabilidad guardarTrazabilidad(Trazabilidad trazabilidad);

    List<Trazabilidad> obtenerTrazabilidadPorIdCliente(Long idCliente);
}
