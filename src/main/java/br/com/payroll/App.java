package br.com.payroll;

import br.com.payroll.entities.Person;
import br.com.payroll.entities.ProductionLineWorker;
import br.com.payroll.entities.SellerWorker;
import br.com.payroll.service.PayRollService;
import br.com.payroll.service.SellerWorkerService;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Jhonatam Calleri", "calleri@gmail.com", 0);
        SellerWorker sellerWorker = new SellerWorker();
        sellerWorker.setHoursWorked(110);
        sellerWorker.setCommission(0.3);
        sellerWorker.setShift('S');
        sellerWorker.setPerson(person);
        sellerWorker.setBaseSalary(1200.0);
        sellerWorker.setQuantitySoldMonth(33000.0);

        ProductionLineWorker lineWorker = new ProductionLineWorker();

        PayRollService service = new SellerWorkerService(sellerWorker);
        System.out.println(String.format("R$ %.2f " , service.netSalary()));

        System.out.println(sellerWorker.showData());
        System.out.printf(sellerWorker.toString());
    }
}