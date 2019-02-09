import CarStatus.CatStatus;
import TypOfBody.TypOfBody;
import lombok.Data;

@Data

public class Cars {

    private String mark;
    private String model;
    private TypOfBody typOfBody;
    private int productionYear;
    private int milage ;
    private CatStatus status;
    private double pricePerDay;

}
