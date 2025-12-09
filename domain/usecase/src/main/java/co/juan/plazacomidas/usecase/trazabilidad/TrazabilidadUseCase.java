package co.juan.plazacomidas.usecase.trazabilidad;

import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;
import co.juan.plazacomidas.model.trazabilidad.gateways.TrazabilidadRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class TrazabilidadUseCase {

    private final TrazabilidadRepository trazabilidadRepository;

    public Trazabilidad guardarTrazabilidad(Trazabilidad trazabilidad) {
        trazabilidad.setFecha(LocalDateTime.now());

        return trazabilidadRepository.guardarTrazabilidad(trazabilidad);
    }

    public List<Trazabilidad> obtenerTrazabilidad(Long idCliente) {
        //TODO: Lógica de negocio, ej. validar que el cliente autenticado coincida con el idCliente
        return trazabilidadRepository.obtenerTrazabilidadPorIdCliente(idCliente);
    }
}
