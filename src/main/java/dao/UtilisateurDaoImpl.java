package dao;

import model.Utilisateur;

public class UtilisateurDaoImpl extends AbstractDao<String, Utilisateur> implements UtilisateurDao {

    public UtilisateurDaoImpl() {
        super();
    }









    /*@Override
    public Utilisateur getUtilisateur(String username) {
        return super.getByKey(username);
    }

    @Override
    public List<Utilisateur> getAllEntities() {
        Session session = getSessionFactory().getCurrentSession();

        List<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();
        try {
            session = getSessionFactory().openSession();
            session.beginTransaction();
            Query qry = session.createQuery("from Utilisateur u");
            listeUtilisateur = qry.list();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            if (session.getTransaction().getStatus() == TransactionStatus.ACTIVE
                    || session.getTransaction().getStatus() == TransactionStatus.MARKED_ROLLBACK) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
        }
        return listeUtilisateur;
    }*/

}

