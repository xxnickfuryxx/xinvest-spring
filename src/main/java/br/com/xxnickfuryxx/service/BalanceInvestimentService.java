package br.com.xxnickfuryxx.service;

import br.com.xxnickfuryxx.model.BalanceInvestiment;
import br.com.xxnickfuryxx.model.User;
import br.com.xxnickfuryxx.repository.BalanceInvestimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceInvestimentService {

    @Autowired
    private BalanceInvestimentRepository repository;

    @Autowired
    private MongoTemplate template;

    public List<BalanceInvestiment> findInvestiments(User user){

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date start = null;
//        Date end = null;
//        try {
//            start = sdf.parse("01/01/2018");
//            end = sdf.parse("31/12/2019");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("col_investment")
                .localField("idInvest")
                .foreignField("idInvest")
                .as("investiment");

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("idUser").is(user.getIdUser())), lookupOperation);

        List<BalanceInvestiment> results =
                template.aggregate(aggregation, "col_income", BalanceInvestiment.class)
                        .getMappedResults();

        return results;
        //return repository.findUserId(user.getIdUser());
    }

}
