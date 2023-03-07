import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    private static final String CORRECT_LOGIN = "login";
    private static final String CORRECT_EMAIL = "work@live.com";
    private static final String INCORRECT_EMAIL = "mailName.com";
    private static final String INCORRECT_LOGIN = "work@live.com";
    @Test
    @DisplayName("Тест проверки равны ли login и email (Они не должны быть равны)")
    void objectFieldsAreNotEquals() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> new User(INCORRECT_LOGIN,CORRECT_EMAIL));
    }
    @Test
    @DisplayName("Тест проверки email (должны быть символы '.' и '@')")
    void checkEmails() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> new User(CORRECT_LOGIN,INCORRECT_EMAIL));
    }
    @Test
    @DisplayName("Тест конструктора с двумя параметрами")
    void testUserFullConstructor() {
        User user = new User(CORRECT_LOGIN,CORRECT_EMAIL);
        Assertions.assertNotNull(CORRECT_LOGIN,user.getLogin());
        Assertions.assertNotNull(CORRECT_EMAIL,user.getEmail());
    }
    @Test
    @DisplayName("Тест пустого конструктора")
    void testUserEmptyConstructor() {
        User user = new User();
        Assertions.assertNull(user.getEmail());
        Assertions.assertNull(user.getLogin());
    }
}