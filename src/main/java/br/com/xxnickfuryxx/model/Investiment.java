package br.com.xxnickfuryxx.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "col_investment")
public class Investiment {

    //{"_id":"5c2a0acd23a8f60207b64a4a","id_invest":1,"name":"CDI 97","update":"daily"}

    @Id
    private String _id;
    private Integer idInvest;
    private String name;
    private String update;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getIdInvest() {
        return idInvest;
    }

    public void setIdInvest(Integer idInvest) {
        this.idInvest = idInvest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}
