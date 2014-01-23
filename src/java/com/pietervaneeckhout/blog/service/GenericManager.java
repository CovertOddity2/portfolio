package com.pietervaneeckhout.blog.service;

import java.util.List;

/**
 *
 * @author pveeckhout
 */
public interface GenericManager<T> {

    public List<T> findAll();

    public T update(T object);

    public T get(Long id);

    public void delete(T object);

    public void insert(T object);

    public boolean exists(Long id);
}
