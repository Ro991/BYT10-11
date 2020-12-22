import java.math.BigDecimal;

public class Accomodation extends Location {
    public BigDecimal cost; // Cost per night
    public Accomodation(String name, double latitude, double longitude, String city, String country, String postalCode) {
        super(name, latitude, longitude, city, country, postalCode);
    }

    public BigDecimal getCost() {
        return cost;
    }
    public void setCost(BigDecimal cost) {
        this.cost=cost;
    }
}
