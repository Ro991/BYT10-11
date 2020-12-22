import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;
public class savedTripTest {
    SavedTrip savedTrip;
    @BeforeEach
    public void before(){
        //unique ID
        String uniqueID = UUID.randomUUID().toString();
        savedTrip = new SavedTrip(uniqueID, "Chicago");
    }
    @Test
    public void TripIdGet(){
        savedTrip.setTripId("10");
        String id = savedTrip.getTripId();
        assertEquals(id,"10");
    }
    @Test
    public void TripIdSet(){
        String id = savedTrip.getTripId();
        assertNotEquals(id, 10);
        savedTrip.setTripId("10");
        id = savedTrip.getTripId();
        assertEquals(id, "10");
    }
    @Test
    public void TripNameGet(){
        savedTrip.setTripName("10");
        String id = savedTrip.getTripName();
        assertEquals(id,"10");
    }
    @Test
    public void TripNameSet(){
        String name = savedTrip.getTripName();
        assertNotEquals(name, 10);
        savedTrip.setTripName("10");
        name = savedTrip.getTripName();
        assertEquals(name, "10");
    }
}