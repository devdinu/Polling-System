package com.springapp.mvc.domain;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dineshkb on 1/15/14.
 */
public class RepositoryHandler<T> {

    @Autowired
    SessionFactory sessionFactory;

    public Session session() {
        return sessionFactory.getCurrentSession();
    }

    public T create(T object) {
        session().save(object);
        return object;
    }

}
