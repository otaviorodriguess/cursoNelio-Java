package composicao.aplicattion;

import composicao.aplicattion.entities.Departament;
import composicao.aplicattion.entities.HourContract;
import composicao.aplicattion.entities.Worker;
import composicao.aplicattion.entities.enums.WorkerLeval;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the departament name: ");
        String departament = sc.nextLine();

        System.out.print("Enter worker data: ");
        String departamentName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, String.valueOf(WorkerLeval.valueOf(workerLevel)), baseSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #"+ i + " data:");
            System.out.print("Date (DD/MM/YYYY): )");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double ValuePorHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, ValuePorHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter the month and year to calcute income (MM/YYYY): )");
        String monthAndYear = sc.nextLine();

        int month = Integer.parseInt(monthAndYear.substring(0,  2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format(" %.2f", worker.incumentSalary(month, year)));


        sc.close();
    }
}
