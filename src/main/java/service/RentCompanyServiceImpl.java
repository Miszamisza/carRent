package service;

import domain.Cars;
import domain.Departments;
import domain.Employees;
import domain.RentCompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompanyServiceImpl implements RentCompanyService {

    @Override
    public RentCompany createNewCompany(String rental, String name, String adress, String webSite, String owner, String logo) {
        RentCompany rentCompany = new RentCompany();
        rentCompany.setRental(rental);
        rentCompany.setName(name);
        rentCompany.setAdress(adress);
        rentCompany.setWebSite(webSite);
        rentCompany.setOwner(owner);
        rentCompany.setLogo(logo);
        List listOfDepartments = new ArrayList();

        return rentCompany;
    }

    @Override
    public RentCompany addDepartmentToCompany(RentCompany rentCompany, List <Departments> departmentsList, String adress) {
            Departments department = new Departments(rentCompany, departmentsList, adress);
            departmentsList.add (department);

            List <Employees> listOfEmloyees = new ArrayList<> ();
            List <Cars> listOfCars = new ArrayList<> ();

        return rentCompany;
    }

    @Override
    public RentCompany removeDepartmentFromCompany() {



        return null;
    }
}
