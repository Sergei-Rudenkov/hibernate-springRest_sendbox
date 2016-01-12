package model;

import java.util.Set;

/**
 * Created by sergei_rudenkov on 30.12.15.
 */

public class Privilage {
    private int id;
    private String privilage;
    private Set <Player> players;

    public Privilage() {
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public String getPrivilage() {
        return privilage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivilage(String privilage) {
        this.privilage = privilage;
    }
}
