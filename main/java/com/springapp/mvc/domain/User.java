package com.springapp.mvc.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dineshkb on 1/10/14.
 */
@Controller
@RequestMapping("/")
public class User {

    @Override
    public String toString() {
        return name+ ", "+id+", "+password;
    }

    private String name;
    private String id;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
