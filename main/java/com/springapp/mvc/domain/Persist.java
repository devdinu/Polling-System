package com.springapp.mvc.domain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Persist {

    @Autowired
    SessionFactory sessionFactory;

    public Idea create(Idea idea) {
        Session session = sessionFactory.getCurrentSession();
        Transaction trans = session.beginTransaction();
        session.save(idea);
        trans.commit();
        return idea;
    }
}
