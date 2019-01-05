package br.com.xxnickfuryxx.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "col_income")
public class BalanceInvestiment {

    //{"_id":"5c2a0ce323a8f60207b64a4d","id_income":1,"id_invest":1,"id_user":"30384673890","value_invest":1000,"value_refresh":0,"date":"2018-12-31T12:44:00.000Z"}

    @Id
    private String _id;
    private Integer idIncome;
    private Integer idInvest;
    private Long idUser;
    private Double valueInvest;
    private Double valueRefresh;
    private Date date;
    private ArrayList<Investiment> investiment;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getIdIncome() {
        return idIncome;
    }

    public void setIdIncome(Integer idIncome) {
        this.idIncome = idIncome;
    }

    public Integer getIdInvest() {
        return idInvest;
    }

    public void setIdInvest(Integer idInvest) {
        this.idInvest = idInvest;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Double getValueInvest() {
        return valueInvest;
    }

    public void setValueInvest(Double valueInvest) {
        this.valueInvest = valueInvest;
    }

    public Double getValueRefresh() {
        return valueRefresh;
    }

    public void setValueRefresh(Double valueRefresh) {
        this.valueRefresh = valueRefresh;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Investiment> getInvestiment() {
        return investiment;
    }

    public void setInvestiment(ArrayList<Investiment> investiment) {
        this.investiment = investiment;
    }
}
