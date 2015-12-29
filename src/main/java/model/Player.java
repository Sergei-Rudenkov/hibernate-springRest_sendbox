package model;

import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * Created by sergei_rudenkov on 29.12.15.
 */

public class Player implements java.io.Serializable {
    private int playerId;
    private String name;
    private String patronimic;
    private String suname;
    private Date birthDate;
    private Date joinDate;

    public Player() {
    }

    public Player(int playerId, String name, String patronimic, String suname, Date birthDate, Date joinDate) {
        this.playerId = playerId;
        this.name = name;
        this.patronimic = patronimic;
        this.suname = suname;
        this.birthDate = birthDate;
        this.joinDate = joinDate;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getSuname() {
        return suname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getJoinDate() {
        return joinDate;
    }
}
