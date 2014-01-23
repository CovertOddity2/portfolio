package com.pietervaneeckhout.blog.service.impl;

import com.pietervaneeckhout.blog.dao.impl.GenericDAOImpl;
import com.pietervaneeckhout.blog.service.GenericManager;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pveeckhout
 */
public abstract class GenericManagerImpl<T, T_DAO extends GenericDAOImpl<T>> implements GenericManager<T> {

    @Autowired
    private T_DAO tDAO;

    @Override
    public List<T> findAll() {
        return tDAO.findAll();
    }

    @Override
    @Transactional
    public T update(T object) {
        return tDAO.update(object);
    }

    @Override
    public T get(Long id) {
        return tDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(T object) {
        tDAO.delete(object);
    }

    @Override
    @Transactional
    public void insert(T object) {
        tDAO.insert(object);
    }

    @Override
    public boolean exists(Long id) {
        return tDAO.exists(id);
    }

}
