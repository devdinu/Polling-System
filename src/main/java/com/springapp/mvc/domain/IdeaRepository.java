package com.springapp.mvc.domain;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IdeaRepository extends RepositoryHandler {

    public Idea creteIdea(Idea idea) {
        begin();
        create(idea);
        end();
        return idea;
    }

    public List<Idea> list() {
        Query query = session.createQuery("From Idea");
        List<Idea>ideaList = query.list();
        return ideaList;
    }
}
