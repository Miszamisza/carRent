package domain;

import domain.Employees;
import domain.Reservation;
import lombok.Data;

import java.time.LocalDate;

@Data

public class Return {
    //pracownik
    //data zwrotu
    //rezerwacja
    //dopłata
    //uwag

    private Employees empolyee;
    private LocalDate dateOfReturn;
    private double extraCost;
    private Reservation reservation;
    private String comments;
}
