import lombok.Data;

import java.util.List;

@Data

public class Departments {
    //adres (z miastem)
    //lista pracowników placówki
    //lista aktualnie dostępnych aut
    private String adress;
    private List <Employees> listOfEmloyees;
    private List <Cars> listOfCars;
}
