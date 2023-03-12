package org.example.Service;
import org.example.Dao.UserDao;
import org.example.model.User;

public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean checkUserExist(User user) {
        if (user != null) {
            return userDao.getUserByName(user.getLogin()) != null;
        }
        return false;
    }
}
