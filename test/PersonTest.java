import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getId() {
        Person p = new UnauthorizedUser(1);
        assertEquals(1, p.getId());
        p.setId(10);
        assertEquals(p.getId(),10);
    }
}