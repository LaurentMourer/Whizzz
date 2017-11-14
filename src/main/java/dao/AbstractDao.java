package dao;

import javax.websocket.Session;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;

    Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass.getName(), key);
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    public void update(T entity) {
        getSession().update(entity);
    }


    public List getAll() {
        final List liste = null;
        try {
            liste = getSession().createQuery("FROM " + persistentClass.getName()).list();
        } catch (HibernateException e) {
        }
        return liste;
    }
}


