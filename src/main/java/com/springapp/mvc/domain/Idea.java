package com.springapp.mvc.domain;

/**
 * Created by dineshkb on 1/15/14.
 */
public class Idea {

    private int id;
    private String description;
    private String purpose;
    private String userName;
    private int userId;
    private int totalPolls = 0;

    public int getTotalPolls() {
        return totalPolls;
    }

    public void setTotalPolls(int totalPolls) {
        this.totalPolls = totalPolls;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return purpose + ": '" + description + "' [" + userId + "], PollCount: " + totalPolls;
    }

    public void poll() {
        totalPolls++;
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

    public void setUserName(String user) {
        this.userName = user;
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

    public String getUserName() {
        return userName;
    }
}
