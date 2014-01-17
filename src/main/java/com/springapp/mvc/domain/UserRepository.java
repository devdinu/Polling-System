package com.springapp.mvc.domain;

import org.hibernate.Query;
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


    public User retrieve(int userId) {
        Query query = session().createQuery("from User where id=:userid");
        query.setInteger("userid", userId);
        return (User) query.uniqueResult();
    }

    public User retrieve(String userName) {
        Query query = session().createQuery("from User where name=:userName");
        query.setString("userName", userName);
        return (User) query.uniqueResult();
    }
}
