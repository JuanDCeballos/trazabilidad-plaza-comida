package co.juan.plazacomidas.api;

import co.juan.plazacomidas.api.dto.TrazabilidadRequestDto;
import co.juan.plazacomidas.api.utils.TrazabilidadMapper;
import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;
import co.juan.plazacomidas.usecase.trazabilidad.TrazabilidadUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/trazabilidad", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final TrazabilidadUseCase trazabilidadUseCase;
    private final TrazabilidadMapper trazabilidadMapper;

    @PostMapping
    public ResponseEntity<Void> guardarTrazabilidad(@Valid @RequestBody TrazabilidadRequestDto requestDto) {
        Trazabilidad trazabilidad = trazabilidadMapper.toTrazabilidad(requestDto);
        trazabilidadUseCase.guardarTrazabilidad(trazabilidad);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
