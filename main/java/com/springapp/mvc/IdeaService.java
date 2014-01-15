package com.springapp.mvc;

import com.springapp.mvc.domain.Idea;
import com.springapp.mvc.domain.Persist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by dineshkb on 1/15/14.
 */
@Service
public class IdeaService {

    @Autowired
    Persist ideaRepository;

    @Transactional
    public Idea create(Idea idea) {
        return ideaRepository.create(idea);
    }
}
