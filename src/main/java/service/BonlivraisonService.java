package service;

import dao.BonlivraisonDao;
import model.Bonlivraison;

import java.util.List;

public class BonlivraisonService {

    private BonlivraisonDao bonlivraisonDao;

    public void creerBonLivraison(Bonlivraison bonlivraison) {
        bonlivraisonDao.persist(bonlivraison);
    }

    public void deleteBonLivraison(Bonlivraison bonlivraison) {
        bonlivraisonDao.delete(bonlivraison);
    }

    public Bonlivraison get(String id) {
        return bonlivraisonDao.getByKey(id);
    }

    public List<Bonlivraison> getAll() {
        return bonlivraisonDao.getAll();

    }

    public BonlivraisonDao getBonlivraisonDao() {
        return bonlivraisonDao;
    }

    public void setBonlivraisonDao(BonlivraisonDao bonlivraisonDao) {
        this.bonlivraisonDao = bonlivraisonDao;
    }
}
