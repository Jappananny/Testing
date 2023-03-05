package org.example.Dao;
import org.example.model.User;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final List<User> users = Arrays.asList(
            new User("JohnSmith", "johnsmith"),
            new  User("JaneDoe", "janedoe"),
            new User("JackBlack", "jackblack")
    );
    @Override
    public User getUserByName(String name) {
        for (User user: users) {
            if (user.getLogin().equals(name)){
                return user;
            }
        }
        return null;
    }
    @Override
    public List<User> getAll(String login) {
        return users.stream().toList();
    }
}
