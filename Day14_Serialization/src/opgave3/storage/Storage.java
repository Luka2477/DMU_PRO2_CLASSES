package opgave3.storage;

import opgave3.application.model.Company;
import opgave3.application.model.Employee;

import java.io.Serializable;
import java.util.ArrayList;

public class Storage implements Serializable {
	private ArrayList<Company> companies = new ArrayList<>();
	private ArrayList<Employee> employees = new ArrayList<>();

	private static Storage storage;

	public static Storage getStorage () {
		if (storage == null) {
			storage = new Storage();
		}
		return storage;
	}

	private Storage () {}

	// -------------------------------------------------------------------------

	public ArrayList<Company> getCompanies() {
		return new ArrayList<>(companies);
	}

	public void addCompany(Company company) {
		companies.add(company);
	}

	public void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public ArrayList<Employee> getEmployees() {
		return new ArrayList<>(employees);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------

}
