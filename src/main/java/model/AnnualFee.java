package model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by sergei_rudenkov on 29.12.15.
 */
public class AnnualFee {
    private int id;
    private Player player;
    private Date payDate;
    private String paid;

    public AnnualFee(int id, Player player, Date payDate, String paid) {
        this.id = id;
        this.player = player;
        this.payDate = payDate;
        this.paid = paid;
    }

    public AnnualFee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public String getPaid() {
        return paid;
    }
}
