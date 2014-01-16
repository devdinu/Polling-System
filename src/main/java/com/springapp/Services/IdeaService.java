package com.springapp.Services;

import com.springapp.mvc.domain.Idea;
import com.springapp.mvc.domain.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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


    @Transactional
    public List<Idea> list()
    {
        return ideaRepository.list();
    }
}
