package domain;

import lombok.Data;

import java.time.LocalDate;

@Data

public class CarRental {

//pracownik
//data wypożyczenia
//rezerwacja
//uwagi

    private Employees employee;
    private LocalDate dateOfReturn;
    private Reservation reservation;
    private String comments;

}
