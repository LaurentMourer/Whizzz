package dao;

import model.Utilisateur;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurDaoImpl extends AbstractDao<String, Utilisateur> implements UtilisateurDao {

    public UtilisateurDaoImpl() {
        super();
    }

    @Override
    public Utilisateur getUtilisateur(String username) {
        return super.getByKey(username);
    }


    /*@Override
    public Utilisateur getUtilisateur(String username) {
        Session session = getSessionFactory().getCurrentSession();

        Utilisateur utilisateur = new Utilisateur();
        try {
            System.out.println("Try");
            session = getSessionFactory().openSession();
            session.beginTransaction();
            utilisateur = session.get(Utilisateur.class, username);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println(e);
            if (session.getTransaction().getStatus() == TransactionStatus.ACTIVE
                    || session.getTransaction().getStatus() == TransactionStatus.MARKED_ROLLBACK) {
                session.getTransaction().rollback();
            }
        } finally {

            session.close();
        }
        return utilisateur;
    }

*/
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
    }

}

