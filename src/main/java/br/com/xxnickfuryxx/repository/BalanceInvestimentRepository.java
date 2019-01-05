package br.com.xxnickfuryxx.repository;

import br.com.xxnickfuryxx.model.BalanceInvestiment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BalanceInvestimentRepository extends MongoRepository<BalanceInvestiment, String> {

    //@Query(value = "{ 'date': { $gte: ?0, $lt: ?1 } }")// between
    @Query(value = "{ 'idUser': ?0 }") //where
    List<BalanceInvestiment> findUserId(Long idUser);
}
