package domain;

import domain.Cars;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Departments {

    private String adress;
    private List <Employees> listOfEmloyees;
    private List <Cars> listOfCars;

    public Departments(RentCompany rentCompany, List<Departments> departmentsList, String adress) {
    }
}
