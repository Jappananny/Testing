import org.example.Dao.UserDaoImpl;
import org.example.Service.UserServiceImpl;
import org.example.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private final UserDaoImpl userDao = Mockito.mock(UserDaoImpl.class);
    private final UserServiceImpl userService;
    public UserServiceTest() {
        userService = new UserServiceImpl(userDao);
    }
    @Test
    void checkUserExist() {
        User Ivan = new User("Иван", "21");
        when(userDao.getUserByName("Иван")).thenReturn(Ivan);
        boolean checkUser = userService.checkUserExist(Ivan);
        assertTrue(checkUser);
    }
    @Test
    void checkNonUserExist() {
        User Masha = null;
        when(userDao.getUserByName("Маша")).thenReturn(null);
        boolean checkUser = userService.checkUserExist(null);
        assertFalse(checkUser);
    }
}

