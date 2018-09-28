package com.greenfox.finder.service;

import com.greenfox.finder.models.User;

import java.util.ArrayList;

public class UserService implements User {

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public UserService service() {
        return new UserService();
    }
}
