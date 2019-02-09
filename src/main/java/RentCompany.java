import lombok.Data;

import java.util.List;

@Data

public class RentCompany {
    private String rental;
    private String name;
    private String webSite;
    private String adress;
    private String owner;
    private String logo;
    private List <Departments> listOfDepartments;

}
