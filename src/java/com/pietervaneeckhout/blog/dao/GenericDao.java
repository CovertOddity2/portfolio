/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pietervaneeckhout.blog.dao;

import java.util.List;

/**
 *
 * @author pveeckhout
 * @param <T> The class to be persisted
 */
public interface GenericDao<T> {

    public List<T> findAll();

    public T update(T object);

    public T get(Long id);

    public void delete(T object);

    public void insert(T object);

    public boolean exists(Long id);
}
