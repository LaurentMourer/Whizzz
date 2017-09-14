package dao;

import model.Utilisateur;

import java.util.List;

public interface UtilisateurDao {

    Utilisateur getByKey(String username);

    List<Utilisateur> getAll();

    void persist(Utilisateur utilisateur);

    void delete(Utilisateur utilisateur);


}
