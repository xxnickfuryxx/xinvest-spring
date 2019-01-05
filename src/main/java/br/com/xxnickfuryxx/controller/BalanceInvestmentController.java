package br.com.xxnickfuryxx.controller;

import br.com.xxnickfuryxx.model.BalanceInvestiment;
import br.com.xxnickfuryxx.model.User;
import br.com.xxnickfuryxx.service.BalanceInvestimentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceInvestmentController {

    @Autowired
    private BalanceInvestimentService service;


//    public BalanceInvestmentController(BalanceInvestimentService service){
//        this.service = service;
//    }

    @PostMapping(value = "/api/balanceinvestment/getBalanceActual",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getBalanceActual(@RequestBody User user){

        List<BalanceInvestiment> list = service.findInvestiments(user);

        return ResponseEntity.ok(new Gson().toJson(list));
    }

    @GetMapping(value = "/api/teste")
    public ResponseEntity<String> teste(){

        return ResponseEntity.ok(new Gson().toJson("{\"msg\":\"ok\"}"));
    }

}
