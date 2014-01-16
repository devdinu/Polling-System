package com.springapp.mvc.domain;

import org.springframework.stereotype.Repository;

/**
 * Created by dineshkb on 1/15/14.
 */

@Repository
public class UserRepository extends RepositoryHandler {

    public User createUser(User user) {
        begin();
        create(user);
        end();
        return user;
    }

    public User retreiveUser(int userId) {
        begin();
        User retrievedUser = super.retrieve(userId);
        end();
        return retrievedUser;
    }
}
