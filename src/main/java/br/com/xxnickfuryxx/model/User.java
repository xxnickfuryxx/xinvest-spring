package br.com.xxnickfuryxx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class User {

    //{"_id":"5c2a0e2c23a8f60207b64a4e","id_user":"30384673890","name":"Tiago Dutra","pass":"aa1bf4646de67fd9086cf6c79007026c"}

    @Id
    private String _id;
    private Long idUser;
    private String name;
    private String pass;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
