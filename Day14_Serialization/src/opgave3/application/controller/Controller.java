package opgave3.application.controller;

import opgave3.application.model.Company;
import opgave3.application.model.Employee;
import opgave3.storage.Storage;

import java.io.*;
import java.util.ArrayList;

public class Controller {

    private static Controller controller;
    private Storage storage;

    public static Controller getController () {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    private Controller () {
        storage = Storage.getStorage();
    }

    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */
    public Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        storage.addCompany(company);
        return company;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public void deleteCompany(Company company) {
        storage.removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public ArrayList<Company> getCompanies() {
        return storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    public Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        storage.addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    public Employee createEmployee(String name, int wage, Company company) {
        Employee employee = createEmployee(name, wage);
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Deletes the employee.
     */
    public void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        storage.removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }
    
    /**
     * Adds the employee to the company. Removes the employee from the old company if present.
     */
    public void addEmployeeToCompany(Employee employee, Company company) {
        company.addEmployee(employee);
    }
    
    /**
     * Removes the employee from the old company if not null.
     * @param company The old company. Can be null.
     * @param employee The employee to remove.
     */
    public void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            company.removeEmployee(employee);            
        }
    }

    /**
     * Get all the employees.
     */
    public ArrayList<Employee> getEmployees() {
        return storage.getEmployees();
    }

    public void loadStorage () {
        try (FileInputStream fileIn = new FileInputStream("day14_serialization/src/opgave3/data/storage.ser")) {
            try (ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
                storage = (Storage) objIn.readObject();
                System.out.println("[LOG] === Storage has been loaded ===");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveStorage () {
        try (FileOutputStream fileOut = new FileOutputStream("day14_serialization/src/opgave3/data/storage.ser")) {
            try (ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(storage);
                System.out.println("[LOG] === Storage has been saved ===");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
