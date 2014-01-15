package com.springapp.mvc.domain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Persist  {

    @Autowired
    SessionFactory sessionFactory;

    public void store(Idea idea) {
        Session session = sessionFactory.openSession();
        session.save(idea);
    }

    public Idea retrieve() {
        Idea idea = null;
        return idea;
    }


}
