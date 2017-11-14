package service;

import dao.AbstractDao;

import java.io.Serializable;
import java.util.List;

public class AbstractService <PK extends Serializable, T> {

    private AbstractDao<PK,T> abstractDao;



    public void create(T entity) {
        abstractDao.persist(entity);
    }

    public void delete(T entity) {
        abstractDao.delete(entity);
    }

    public T get(PK id) {
        return abstractDao.getByKey(id);
    }

    public List getAll() {
        return abstractDao.getAll();

    }

    public void update(T entity)
    {
        abstractDao.update(entity);
    }

    public AbstractDao<PK, T> getAbstractDao() {
        return abstractDao;
    }


    public void setAbstractDao(AbstractDao<PK, T> abstractDao) {
        this.abstractDao = abstractDao;


    }
}
