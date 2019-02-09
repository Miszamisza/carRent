package service;

import domain.Cars;
import domain.Departments;
import domain.Employees;
import domain.RentCompany;

import java.util.List;

public interface RentCompanyService {

    RentCompany createNewCompany(String rental, String name, String adress, String www, String owner, String logo);
    RentCompany addDepartmentToCompany(RentCompany rentCompany, List<Departments> departmentsList, String adress);
    RentCompany removeDepartmentFromCompany();

}
