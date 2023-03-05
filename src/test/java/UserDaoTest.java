import org.example.Dao.UserDaoImpl;
import org.example.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {
    private  final User correctUser = new User("JohnSmith", "johnsmith");
    private  final User incorrectUser = new User("JohnSmith", "jackblack");

    @Test
    public void findUserByName(){
        assertNotNull(new UserDaoImpl().getUserByName(correctUser.getLogin()));
        assertEquals("JohnSmith", new UserDaoImpl().getUserByName(correctUser.getLogin()).getLogin());
    }
    @Test
    public void notFindUserByName(){
        assertNull(new UserDaoImpl().getAll(incorrectUser.getLogin()));
    }
}
