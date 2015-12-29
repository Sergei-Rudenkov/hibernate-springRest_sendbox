package controller;

/**
 * Created by sergei_rudenkov on 24.12.15.
 */

import model.Player;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.HibernateUtil;
import util.CommonUtil;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @RequestMapping(value = "/add_player", method = RequestMethod.POST)
    public void insertNewPlayer(@RequestParam("name") String name,
                         @RequestParam("patronimic") Optional<String> patronimic,
                         @RequestParam("suname") String suname,
                         @RequestParam("birth_date") String bDate,
                         @RequestParam("joining_date") String jDate) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Player player = new Player();

        player.setName(name);
        player.setPatronimic(patronimic.isPresent()?patronimic.get():null);
        player.setSuname(suname);
        try {
            player.setBirthDate(CommonUtil.DATE_FORMAT.parse(bDate));
            player.setJoinDate(CommonUtil.DATE_FORMAT.parse(jDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        session.save(player);
        session.getTransaction().commit();
    }

    @RequestMapping("/get_players")
    public List getPlayers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Player";
        Query query = session.createQuery(hql);
        return query.list();
    }

    @RequestMapping("/get_annual_fee")
    public List getAnnualFee() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Player as p left outer join p.playerId as fee"; // <- not checked 
        Query query = session.createQuery(hql);
        return query.list();
    }
}