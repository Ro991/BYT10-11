import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Trip {
    private ArrayList<Route> routes;
    private LocalDate startDateTime;
    private LocalDate endDateTime;
    private Location origin;
    private Location finalDestination;
    private ArrayList<Accommodation> accommodation;

    public Trip(LocalDate startDateTime, LocalDate endDateTime, Location origin, Location finalDestination) throws Exception {
        if(startDateTime.compareTo(endDateTime) < 0) {
            throw new Exception("start date is before end time");
        }

        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.origin = origin;
        this.finalDestination = finalDestination;
    }

    public Trip(Location origin, Location finalDestination) throws Exception {
        this(null, null, origin, finalDestination);
    }

    public BigDecimal tripCost() {
        return null;
    }

    public static Trip createSchedule() {
        return null;
    }

    public ArrayList<Accommodation> getAccommodation() {
        return accommodation;
    }

    public LocalDate getEndDateTime() {
        return endDateTime;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public LocalDate getStartDateTime() {
        return startDateTime;
    }

    public Location getFinalDestination() {
        return finalDestination;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setEndDateTime(LocalDate endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setFinalDestination(Location finalDestination) {
        this.finalDestination = finalDestination;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public void setStartDateTime(LocalDate startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void addRoute(Route route) {

    }

    public void addAccommodation(Accommodation accommodation) {

    }
}
