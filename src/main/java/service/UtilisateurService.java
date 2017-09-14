package service;

import dao.UtilisateurDao;
import dao.UtilisateurDaoImpl;
import model.Utilisateur;

import java.util.List;

public class UtilisateurService {

    private UtilisateurDao utilisateurDao;

    public void creerUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.persist(utilisateur);
    }

    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.delete(utilisateur);
    }

    public Utilisateur getUtilisateur(String id) {
        return utilisateurDao.getByKey(id);
    }

    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurDao.getAll();
    }

    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }
}
