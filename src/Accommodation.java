import java.math.BigDecimal;

public class Accommodation extends Location {
    public BigDecimal cost; // Cost per night
    public Accommodation(String name, double latitude, double longitude, String city, String country, String postalCode) {
        super(name, latitude, longitude, city, country, postalCode);
    }

    public BigDecimal getCost() {
        return cost;
    }
    public void setCost(BigDecimal cost) {
        this.cost=cost;
    }
}
