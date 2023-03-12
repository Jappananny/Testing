import org.example.Dao.UserDaoImpl;
import org.example.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {
    UserDaoImpl dao = new UserDaoImpl();
    private  final User correctUser = new User("JohnSmith", "johnsmith");
    private  final User incorrectUser = new User("JeckSmith", "jackblack");

    @Test
    public void findUserByName(){
        assertNotNull(dao.getUserByName(correctUser.getLogin()));
        assertEquals("JohnSmith", dao.getUserByName(correctUser.getLogin()).getLogin());
        assertEquals("johnsmith", dao.getUserByName(correctUser.getLogin()).getPassword());
    }
    @Test
    public void notFindUserByName(){
        assertNull(dao.getUserByName(incorrectUser.getLogin()));
    }
}
