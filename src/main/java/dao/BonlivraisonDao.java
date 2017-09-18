package dao;

import model.Bonlivraison;
import org.hibernate.Query;

import java.util.Date;
import java.util.List;

public class BonlivraisonDao extends AbstractDao<String, Bonlivraison> {

    public List<Bonlivraison> getBonLivraisonBtDate(Date date) {
        Query query = getSession().createQuery("from Bonlivraison where datecreation = :datecreation");
        query.setParameter("datecreation", date);
        return query.list();
    }

    public List<Date> getDate() {
        Query query = getSession().createQuery("select distinct datecreation from Bonlivraison order by datecreation desc");
        return query.list();
    }
}
