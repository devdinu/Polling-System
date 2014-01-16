package com.springapp.Services;

import com.springapp.mvc.domain.Idea;
import com.springapp.mvc.domain.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IdeaService {

    @Autowired
    IdeaRepository ideaRepository;

    @Transactional
    public Idea create(Idea idea) {
        return ideaRepository.creteIdea(idea);
    }


    @Transactional
    public List<Idea> list()
    {
        return ideaRepository.list();
    }

    @Transactional
    public void poll(int ideaId) {
        ideaRepository.poll(ideaId);
    }
}
