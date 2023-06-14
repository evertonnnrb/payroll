package br.com.payroll;

import br.com.payroll.entities.FinancialWorker;
import br.com.payroll.entities.Person;
import br.com.payroll.entities.SellerWorker;
import br.com.payroll.service.FinancialWorkerService;
import br.com.payroll.service.PayRollService;
import br.com.payroll.service.SellerWorkerService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Locale.setDefault(Locale.US);
        System.out.println("Cadastrar funcionario ");
        System.out.print("Nome :");
        String name = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Quantidade de filhos ");
        int qtdChildren = in.nextInt();
        System.out.print("Quantidade de horas trabalhadas no mês ");
        int hoursWorked = in.nextInt();
        System.out.print("Valor do salário base : ");
        double baseSalary = in.nextDouble();

        Person person = new Person(name, email, qtdChildren);

        System.out.println("1-Vendedor \n2-Financeiro \n3-Linha de produção \n4-Gerente");
        int option = in.nextInt();
        switch (option) {
            case 1:
                System.out.printf("Qual o valor da comissão do vendedor ");
                double comission = in.nextDouble();
                System.out.printf("Qual a quantidade vendida no mês ");
                double quantitySoldMonth = in.nextDouble();
                SellerWorker worker = new SellerWorker(person, 'C', hoursWorked, baseSalary, comission, quantitySoldMonth);
                PayRollService sellerService = new SellerWorkerService(worker);
                System.out.println(worker);
                System.out.println(sellerService.netSalary());
                System.out.println(sellerService.taxSalary());
                break;
            case 2:
                System.out.println("Informe o valor da ajuda de custo do departamento financeiro :");
                double subussitenceAllowance = in.nextDouble();
                FinancialWorker financialWorker = new FinancialWorker(person, 'F', hoursWorked, baseSalary, subussitenceAllowance);
                PayRollService servicev=new FinancialWorkerService(financialWorker);
                System.out.println(financialWorker);
                break;
            case 3:
                System.out.println();

        }


    }
}