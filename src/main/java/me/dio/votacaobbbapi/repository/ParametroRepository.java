package me.dio.votacaobbbapi.repository;

import me.dio.votacaobbbapi.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ParametroRepository extends MongoRepository<ParametroModel, Long> {

    ParametroModel save(ParametroModel parametros);

    Optional<ParametroModel> findById(String chave);
}
