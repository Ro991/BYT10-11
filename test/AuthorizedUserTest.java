import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;

public class AuthorizedUserTest {
    AuthorizedUser authorizedUser;
    @BeforeEach
    public void before(){
        //unique ID
        String uniqueID = UUID.randomUUID().toString();
        authorizedUser = new AuthorizedUser(uniqueID, "Georgie", "georgie@IT.com");
    }

    @Test
    public void getNameTest(){
        String name = authorizedUser.getName();
        assertEquals(name, "Georgie");
    }
    @Test
    public void setNameTest(){
        String name = authorizedUser.getName();
        assertNotEquals(name, "Mike");
        authorizedUser.setName("Mike");
        name = authorizedUser.getName();
        assertEquals(name, "Mike");
    }
    @Test
    public void getEmailTest(){
        String email = authorizedUser.getEmail();
        assertEquals(email, "georgie@IT.com");
    }
    @Test
    public void setEmailTest(){
        String email = authorizedUser.getEmail();
        assertNotEquals(email, "mike@gmail.com");
        authorizedUser.setEmail("mike@gmail.com");
        email = authorizedUser.getEmail();
        assertEquals(email, "mike@gmail.com");
    }
}
