package co.juan.plazacomidas.mongo;

import co.juan.plazacomidas.mongo.entities.TrazabilidadData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface MongoDBRepository extends MongoRepository<TrazabilidadData, String>, QueryByExampleExecutor<TrazabilidadData> {
    List<TrazabilidadData> findByIdCliente(Long idCliente);
}
