package opgave3.setup;

import opgave3.application.controller.Controller;
import opgave3.application.model.Company;

public class StorageInitializer {

    public static void main(String[] args) {
        Controller controller = Controller.getController();
        Company c1 = controller.createCompany("IBM", 37);
        Company c2 = controller.createCompany("AMD", 40);
        controller.createCompany("SLED", 45);
        controller.createCompany("Vector", 32);

        controller.createEmployee("Bob Dole", 210, c2);
        controller.createEmployee("Alice Schmidt", 250, c1);
        controller.createEmployee("George Down", 150, c2);

        controller.createEmployee("Rita Uphill", 300);

        controller.saveStorage();
    }

}
