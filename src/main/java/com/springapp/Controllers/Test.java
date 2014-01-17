package com.springapp.Controllers;

/**
 * Created by dineshkb on 1/17/14.
 */
public class Test {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
