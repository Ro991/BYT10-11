import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Flight implements Transportation {


    @java.lang.Override
    public BigDecimal getCost() {
        return new BigDecimal(1);
    }

    @java.lang.Override
    public double calculateDistance() {
        return 1.0;
    }

    @java.lang.Override
    public List<LocalDate> createSchedule() {
        return null;
    }
}
