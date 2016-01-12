package model;

/**
 * Created by sergei_rudenkov on 30.12.15.
 */
public class PlayerPrivilage {

    private int id;
    private Player player;
    private Privilage privilage;

    public PlayerPrivilage() {
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setPrivilage(Privilage privilage) {
        this.privilage = privilage;
    }

    public Player getPlayer() {
        return player;
    }

    public Privilage getPrivilage() {
        return privilage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
