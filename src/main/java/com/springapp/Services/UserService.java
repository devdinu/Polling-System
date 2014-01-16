package com.springapp.Services;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by dineshkb on 1/15/14.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public User creUser(User user) {
        return userRepository.createUser(user);
    }

    @Transactional
    public User retrieve(int userId) {
        return userRepository.retrieveUser(userId);
    }

    @Transactional
    private User retrieve(String name) {
        return userRepository.retrieve(name);
    }


    public boolean validate(int id, String password) {
        User userMatchedID = retrieve(id);
        if (userMatchedID == null) {
            System.out.println("userid not exists");
            return false;
        }
        if (userMatchedID.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public boolean validate(String name, String password) {
        User userMatchedID = retrieve(name);
        System.out.println(userMatchedID);
        if (userMatchedID == null) {
            System.out.println("userid not exists");
            return false;
        }
        if (userMatchedID.getPassword().equals(password)) {
            return true;
        }
        return false;
    }



}
