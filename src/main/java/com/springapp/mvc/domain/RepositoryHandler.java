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

    public User retrieve(int userId) {
        Query query = session().createQuery("from User where id=:userid");
        query.setInteger("userid", userId);
        return (User) query.uniqueResult();
    }

    public User retrieve(String userName) {
        Query query = session().createQuery("from User where name=:userName");
        query.setString("userName", userName);
        return (User) query.uniqueResult();
    }
}
