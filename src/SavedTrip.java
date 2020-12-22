public class SavedTrip {
    private String tripId;
    private String tripName;

    public SavedTrip(String tripId, String tripName){
        this.tripId = tripId;
        this.tripName = tripName;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }
    public Trip editTrip(Trip trip){
        return trip;
    }
    public void deleteTrip(Trip selectedTrip){

    }
}
