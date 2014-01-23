package com.pietervaneeckhout.blog.dao.impl;

import com.pietervaneeckhout.blog.dao.GenericDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author pveeckhout
 */
public abstract class GenericDAOImpl<T> implements GenericDao<T> {

    private final Class<T> type;

    @PersistenceContext
    private EntityManager entityManager;

    public GenericDAOImpl(Class<T> type) {
        super();
        this.type = type;
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = builder.createQuery(type);
        Root<T> root = cq.from(type);
        cq.select(root);
        return this.entityManager.createQuery(cq).getResultList();
    }

    @Override
    public T update(T object) {
        return this.entityManager.merge(object);
    }

    @Override
    public T get(Long id) {
        return this.entityManager.find(type, id);
    }

    @Override
    public void delete(T object) {
        this.entityManager.remove(this.entityManager.merge(object));
    }

    @Override
    public void insert(T object) {
        this.entityManager.persist(object);
    }

    @Override
    public boolean exists(Long id) {
        T entity = this.entityManager.find(this.type, id);
        return entity != null;
    }

}
