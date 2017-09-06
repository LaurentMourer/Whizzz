package dao;

import model.Utilisateur;

import java.util.List;

public interface UtilisateurDao {

    Utilisateur getUtilisateur(String username);
     List<Utilisateur> getAllEntities();

}
