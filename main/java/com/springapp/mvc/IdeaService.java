package com.springapp.mvc;

import com.springapp.mvc.domain.Idea;
import com.springapp.mvc.domain.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by dineshkb on 1/15/14.
 */
@Service
public class IdeaService {

    @Autowired
    IdeaRepository ideaRepository;

    @Transactional
    public Idea create(Idea idea) {
        return ideaRepository.creteIdea(idea);
    }

}
