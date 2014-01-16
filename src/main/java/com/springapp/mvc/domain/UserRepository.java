package com.springapp.mvc.domain;

import org.springframework.stereotype.Repository;

/**
 * Created by dineshkb on 1/15/14.
 */

@Repository
public class UserRepository extends RepositoryHandler {

    public User createUser(User user) {
        create(user);
        return user;
    }

    public User retrieveUser(int userId) {
        User retrievedUser = retrieve(userId);
        return retrievedUser;
    }
}
