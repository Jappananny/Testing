package org.example.Service;
import org.example.Dao.UserDaoImpl;
import org.example.model.User;

public class UserServiceImpl implements UserService{
    private final UserDaoImpl userDaoImpl;
    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }
    @Override
    public boolean checkUserExist(User user) {
        if (user != null) {
            return userDaoImpl.getUserByName(user.getLogin()) != null;
        }
        return false;
    }
}
