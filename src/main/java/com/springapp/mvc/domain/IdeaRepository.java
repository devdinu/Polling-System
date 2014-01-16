package com.springapp.mvc.domain;


import org.springframework.stereotype.Repository;

@Repository
public class IdeaRepository extends RepositoryHandler {

    public Idea creteIdea(Idea idea) {
        begin();
        create(idea);
        end();
        return idea;
    }
}
