import lombok.Data;

import java.time.LocalDate;


@Data

public class Reservation {

    private LocalDate dateOfReservation;
    private Costumer costumer;
    private Cars car;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private Departments startDepartment;
    private Departments endDepartment;
    private double finalPrice;

}
