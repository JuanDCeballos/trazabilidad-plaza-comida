package co.juan.plazacomidas.mongo.utils;

import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;
import co.juan.plazacomidas.mongo.entities.TrazabilidadData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrazabilidadMongoMapper {

    Trazabilidad toDomain(TrazabilidadData trazabilidadData);

    TrazabilidadData toData(Trazabilidad trazabilidad);
}
