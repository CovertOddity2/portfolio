package com.pietervaneeckhout.hibernate;

import org.hibernate.SessionFactory;

/**
 *
 * @author pveeckhout
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }
}
