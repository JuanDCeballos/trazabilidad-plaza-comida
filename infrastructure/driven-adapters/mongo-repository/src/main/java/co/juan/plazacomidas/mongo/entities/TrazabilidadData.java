package co.juan.plazacomidas.mongo.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "trazabilidad")
@Getter
@Setter
@Builder
public class TrazabilidadData {

    @Id
    private String id;

    private Long idPedido;
    private Long idCliente;
    private String correoCliente;
    private LocalDateTime fecha;
    private String estadoAnterior;
    private String estadoNuevo;
    private Long idEmpleado;
    private String correoEmpleado;
}
