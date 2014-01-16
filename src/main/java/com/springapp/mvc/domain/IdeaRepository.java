package com.springapp.mvc.domain;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IdeaRepository extends RepositoryHandler {

    public Idea creteIdea(Idea idea) {
        create(idea);
        return idea;
    }

    public List<Idea> list() {
        Query query = session().createQuery("From Idea");
        List<Idea> ideaList = query.list();
        return ideaList;
    }

    public Idea getIdea(int ideaId) {
        Query query = session().createQuery("from Idea where id=:ideaId");
        query.setInteger("ideaId", ideaId);
        return (Idea) query.uniqueResult();
    }


    public void poll(int ideaId) {
        Idea polledIdea = getIdea(ideaId);
        polledIdea.poll();
        System.out.println(polledIdea);
        session().update(polledIdea);
    }
}
