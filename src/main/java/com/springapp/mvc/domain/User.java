package com.springapp.mvc.domain;

/**
 * Created by dineshkb on 1/10/14.
 */
public class User {

    @Override
    public String toString() {
        return name + ", " + id + ", " + password;
    }

    private String name;
    private int id;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
