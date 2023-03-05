package org.example.Dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);
    List<User> getAll(String login);
}
