package br.com.autopass.repository;

import br.com.autopass.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {}
