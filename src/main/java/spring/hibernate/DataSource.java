package spring.hibernate;

import spring.services.CarsServiceImpl;
import spring.services.EmployeesService;
import spring.services.PrintersServiceImpl;

import java.util.*;

public class DataSource {

    private static EmployeesService employeesService;
    private static CarsServiceImpl carsService;
    private static PrintersServiceImpl printersService;

//    public static boolean isDatabaseConnection = Boolean.FALSE;
//    private static HibernateDao hibernateDao = null;
//
//    public static void supplyDatabase() {
//
//        try {
//            hibernateDao = new HibernateDao();
//            isDatabaseConnection = Boolean.TRUE;
//        } catch (NullPointerException e) {
//            System.out.println("No database connection.");
//            e.getStackTrace();
//        }
//
//        Employees employee1 = new Employees("Piotr", "Pawlak", "Grójecka 28", "Warszawa", 1000, 18, new Date(), 0, "piotr.p@ourcompany.pl");
//        Employees employee2 = new Employees("Paweł", "Kaczyński", "Zielona 28", "Kraków", 2000, 28, new Date(), 1, "pawel@ourcompany.pl");
//        Employees employee3 = new Employees("Anna", "Pawlak", "Grójecka 28", "Warszawa", 3000, 45, new Date(), 1, "anna@ourcompany.pl");
//        Employees employee4 = new Employees("Katarzyna", "Gierszałt", "Marymoncka 28", "Gdynia", 4000, 39, new Date(), 1, "katarzyna@ourcompany.pl");
//        Employees employee5 = new Employees("Maciej", "Józefowicz", "Koszykowa 28", "Warszawa", 5000, 31, new Date(), 1, "maciej@ourcompany.pl");
//        Employees employee6 = new Employees("Genowefa", "Pigwa", "Rybickiego 128", "Zamość", 6000, 29, new Date(), 1, "genowefa@ourcompany.pl");
//        Employees employee7 = new Employees("Piotr", "Złomczyński", "Szucha 8", "Warszawa", 1500, 18, new Date(), 0, "piotr.z@ourcompany.pl");
//
//        // sprawdzamy, czy pracownicy są już w bazie czy nie
//        List<Employees> verificationList = hibernateDao.get(Employees.class);
//
//        List<Employees> listToAdd = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7));
//        listToAdd.removeAll(verificationList);
//
//        for (Employees employee : listToAdd) {
//            hibernateDao.saveEntity(employee);
//        }
//
//        Cars car1 = new Cars(employee6, "Subaru", "Forester", new Date());
//        Cars car2 = new Cars(employee2, "Ford", "Fiesta", new Date());
//        Cars car3 = new Cars(employee3, "Fiat", "126p", new Date());
//        Cars car4 = new Cars(employee4, "Subaru", "Forester", new Date());
//        Cars car5 = new Cars(employee5, "Subaru", "Forester", new Date());
//
//        hibernateDao.saveEntity(car1);
//        hibernateDao.saveEntity(car2);
//        hibernateDao.saveEntity(car3);
//        hibernateDao.saveEntity(car4);
//        hibernateDao.saveEntity(car5);
//
//        Set<Employees> setForPrinter1 = new HashSet<>(listToAdd);
//        Set<Employees> setForPrinter2 = new HashSet<>(Arrays.asList(employee1, employee6, employee7));
//
//        Printers printer1 = new Printers(setForPrinter1, "Hewlett Packard", "1234h", true, true);
//        Printers printer2 = new Printers("EasyJet", "asd", true, false);
//        Printers printer3 = new Printers(setForPrinter2, "Optimus", "Prime", false, false);
//
//        // sprawdzamy, czy drukarki są już w bazie czy nie
//        List<Printers> printersVerificationList = hibernateDao.get(Printers.class);
//
//        List<Printers> printersListToAdd = new ArrayList<>(Arrays.asList(printer1, printer2, printer3));
//        printersListToAdd.removeAll(printersVerificationList);
//
//        for (Printers printer : printersListToAdd) {
//            hibernateDao.saveEntity(printer);
//        }
//
//    }

//    public static void deleteData(Class<T> type){
//        List<T> listToDelete = hibernateDao.get(class)
//    }

    public static void restoreDatabase() {
        List<Employees> allEmployees = employeesService.getAll();
        for (Employees employees : allEmployees) {
            employeesService.delete(employees);
        }

        List<Cars> allCars = carsService.getAll();
        for (Cars cars : allCars) {
            carsService.delete(cars);
        }

        List<Printers> allPrinters = printersService.getAll();
        for (Printers printers : allPrinters) {
            printersService.delete(printers);
        }

        // supplyDatabase();
    }


}
