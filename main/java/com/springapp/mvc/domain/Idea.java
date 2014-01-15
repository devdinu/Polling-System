package com.springapp.mvc.domain;

/**
 * Created by dineshkb on 1/15/14.
 */
public class Idea {
    private int id;
    private String description;
    private String purpose;
    private String user;

    @Override
    public String toString() {
        return description + ", [" + purpose + "] " + user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getUser() {
        return user;
    }
}
