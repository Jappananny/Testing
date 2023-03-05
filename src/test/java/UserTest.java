import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    final String correctEmail = "work@live.com";
    final String wrongEmail = "mailName.com";
    final String name1 = "Evgen";
    final String name2 = "PetrI";

    User user1;
    User user2;
    User user3;

    @BeforeEach
    public void setUp() {
        user1 = new User(name1, correctEmail);
        user2 = new User(name2, wrongEmail);
        user3 = new User();
    }
    @Test
    @DisplayName("Тест проверки равны ли login и email (Они не должны быть равны)")
    void objectFieldsAreNotEquals() {
        Assertions.assertNotEquals(user1.getEmail(), user1.getLogin());
    }
    @Test
    @DisplayName("Тест проверки email (должны быть символы '.' и '@')")
    void checkEmails() {
        Assertions.assertTrue(user1.checkEmails(user1.getEmail()));
    }
    @Test
    @DisplayName("Тест конструктора с двумя параметрами")
    void testUserFullConstructor() {
        Assertions.assertNotNull(user1.getLogin());
        Assertions.assertNotNull(user1.getEmail());
    }
    @Test
    @DisplayName("Тест пустого конструктора")
    void testUserEmptyConstructor() {
        Assertions.assertNull(user3.getEmail());
        Assertions.assertNull(user3.getLogin());
    }
}