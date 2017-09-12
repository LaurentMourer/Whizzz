package service;

import dao.EnvironnementDao;
import model.Environnement;

import java.util.List;

public class EnvironnementService {

    private EnvironnementDao environnementDao;

    public void creerEnvironnement(Environnement environnement) {
        environnementDao.persist(environnement);
    }

    public void deleteBonLivraison(Environnement environnement) {
        environnementDao.delete(environnement);
    }

    public Environnement get(String id) {
        return environnementDao.getByKey(id);
    }

    public List<Environnement> getAll() {
        return environnementDao.getAll();
    }

    public EnvironnementDao getEnvironnementDao() {
        return environnementDao;
    }

    public void setEnvironnementDao(EnvironnementDao environnementDao) {
        this.environnementDao = environnementDao;
    }
}
