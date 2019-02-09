import domain.Departments;
import domain.Employees;
import domain.RentCompany;
import service.RentCompanyService;
import service.RentCompanyServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Departments> listOfdepartments;
    private static RentCompany newCompany;

    public static void main(String[] args ){

        Scanner inputScanner = new Scanner(System.in);

        String operation="";

        RentCompanyService rentCompanyService = new RentCompanyServiceImpl();

        do {
            operation = inputScanner.nextLine ();
            if (operation == "1") {
                String rental = inputScanner.nextLine ();
                String name = inputScanner.nextLine ();
                String webSite = inputScanner.nextLine ();
                String adress = inputScanner.nextLine ();
                String owner = inputScanner.nextLine ();
                String logo = inputScanner.nextLine ();
                System.out.println ("Do bazy dodano :" + rentCompanyService.createNewCompany (rental, name, webSite, adress, owner, logo));
                System.out.println ("Jeśli chcesz zakończyć wpisz exit");
                
            }
            
            if (operation == "2"){
                if (newCompany != null) {
                    String adress = inputScanner.nextLine ();
                    rentCompanyService.addDepartmentToCompany (newCompany, listOfdepartments, adress);

                }

            }
            
            if (operation == "3"){
                
            }

        } while (!operation.equals ("exit"));

        
        
        


    }
}
