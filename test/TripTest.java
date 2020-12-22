import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {

    Trip trip = null;

    @Test
    void Trip(){
        try {
            trip = new Trip(LocalDate.MIN,LocalDate.MAX,new Accommodation("test",10.0,10.2,
                    "city","country","00-001"),
                    new Accommodation("test2",5.0,5.2,"city2","country2","00-002"));
        } catch (Exception e) {
            assertEquals(e.getMessage(),"start date is before end time");
        }
    }

    @Test
    void setStartDateTime() {
        LocalDate testVal = LocalDate.now();
        if (trip != null){
            trip.setStartDateTime(testVal);
            assertEquals(trip.getStartDateTime(),testVal);
        }
    }

}