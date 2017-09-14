package service;

import dao.DomaineDao;
import model.Domaine;

import java.util.List;

public class DomaineService {

    private DomaineDao domaineDao;

    public void creerDomaine(Domaine domaine) {
        domaineDao.persist(domaine);
    }

    public void deleteDomaine(Domaine domaine) {
        domaineDao.delete(domaine);
    }

    public Domaine getDomaine(Long id) {
        return domaineDao.getByKey(id);
    }

    public DomaineDao getDomaineDao() {
        return domaineDao;
    }

    public void setDomaineDao(DomaineDao domaineDao) {
        this.domaineDao = domaineDao;
    }

    public List<Domaine> getAll() {
        return domaineDao.getAll();


    }
}