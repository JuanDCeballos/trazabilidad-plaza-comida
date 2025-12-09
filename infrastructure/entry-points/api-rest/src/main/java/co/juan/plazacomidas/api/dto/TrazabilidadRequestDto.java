package co.juan.plazacomidas.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrazabilidadRequestDto {

    @NotNull(message = "El id del pedido es obligatorio")
    private Long idPedido;

    @NotNull(message = "El id del cliente es obligatorio")
    private Long idCliente;

    @NotBlank(message = "El correo del cliente es obligatorio")
    private String correoCliente;

    @NotBlank(message = "El estado anterior es obligatorio")
    private String estadoAnterior;

    @NotBlank(message = "El estado nuevo es obligatorio")
    private String estadoNuevo;

    @NotNull(message = "El id del empleado es obligatorio")
    private Long idEmpleado;

    @NotBlank(message = "El correo del empleado es obligatorio")
    private String correoEmpleado;
}
