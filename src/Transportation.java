import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface Transportation {


    public BigDecimal getCost();

    public double calculateDistance();

    public List<LocalDate> createSchedule();



}
