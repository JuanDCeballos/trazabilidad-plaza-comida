package co.juan.plazacomidas.mongo;

import co.juan.plazacomidas.model.trazabilidad.Trazabilidad;
import co.juan.plazacomidas.model.trazabilidad.gateways.TrazabilidadRepository;
import co.juan.plazacomidas.mongo.entities.TrazabilidadData;
import co.juan.plazacomidas.mongo.helper.AdapterOperations;
import co.juan.plazacomidas.mongo.utils.TrazabilidadMongoMapper;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Trazabilidad, TrazabilidadData, String, MongoDBRepository>
        implements TrazabilidadRepository {

    private final TrazabilidadMongoMapper trazabilidadMongoMapper;

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper,
                                  TrazabilidadMongoMapper trazabilidadMongoMapper) {
        super(repository, mapper, d -> mapper.map(d, Trazabilidad.class));
        this.trazabilidadMongoMapper = trazabilidadMongoMapper;
    }

    @Override
    public Trazabilidad guardarTrazabilidad(Trazabilidad trazabilidad) {
        return save(trazabilidad);
    }

    @Override
    public List<Trazabilidad> obtenerTrazabilidadPorIdCliente(Long idCliente) {
        return repository.findByIdCliente(idCliente)
                .stream().map(trazabilidadMongoMapper::toDomain).toList();
    }
}
