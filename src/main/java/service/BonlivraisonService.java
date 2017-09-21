package service;

import dao.BonlivraisonDao;
import model.Bonlivraison;
import org.apache.log4j.Logger;

import java.util.*;

public class BonlivraisonService extends AbstractService {

    private static final Logger logger = Logger.getLogger(BonlivraisonService.class);

    public List<Date> getDateBl() {
        BonlivraisonDao bonlivraisonDao = (BonlivraisonDao) getAbstractDao();
        return bonlivraisonDao.getDate();
    }


    public List<Bonlivraison> getBonLivraisonByDate(Date date) {
        BonlivraisonDao bonlivraisonDao = (BonlivraisonDao) getAbstractDao();
        logger.info(bonlivraisonDao.getBonLivraisonBtDate(date));

        return bonlivraisonDao.getBonLivraisonBtDate(date);
    }

}
