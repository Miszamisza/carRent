package domain;

import domain.Departments;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RentCompany {
    private String rental;
    private String name;
    private String webSite;
    private String adress;
    private String owner;
    private String logo;
    private List <Departments> listOfDepartments;

}
