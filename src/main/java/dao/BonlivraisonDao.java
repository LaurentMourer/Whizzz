package dao;

import model.Bonlivraison;

public class BonlivraisonDao extends AbstractDao<String, Bonlivraison> {

    public void update(Bonlivraison bonlivraison) {
        Bonlivraison bonlivraison1 = getSession().get(Bonlivraison.class,bonlivraison.getNumjira());
        getSession().evict(bonlivraison1);
        bonlivraison1.setDescription(bonlivraison.getDescription());
        bonlivraison1.setDomaine(bonlivraison.getDomaine());
        bonlivraison1.setPret(bonlivraison.getPret());
        bonlivraison1.setSource(bonlivraison.getSource());
        bonlivraison1.setDatecreation(bonlivraison.getDatecreation());
        getSession().update(bonlivraison1);
    }
}
