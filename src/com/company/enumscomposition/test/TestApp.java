package com.company.enumscomposition.test;

import com.company.enumscomposition.entities.Department;
import com.company.enumscomposition.entities.HourContract;
import com.company.enumscomposition.entities.Worker;
import com.company.enumscomposition.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestApp {

    public static void main(String[] args) throws ParseException {
        System.out.println("DANGER ROOM");
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("--------------------");
        System.out.println(department);

        System.out.println("Enter worker data:");
        Worker worker = new Worker();
        worker.setDepartment(department);
        System.out.print("Name: ");
        worker.setName(sc.nextLine());
        System.out.print("Level: ");
        worker.setLevel(WorkLevel.valueOf(sc.nextLine()));
        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.println("--------------------");
        System.out.println(worker);
        System.out.println("--------------------");

        System.out.print("How many contracts do this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++) {
            System.out.printf("Enter contract #%d data:%n",i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            System.out.println("--------------------");
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            System.out.println(contract);
            System.out.println();

        }

        System.out.print("Enter month and year to calculate income: ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));







        sc.close();
    }
}
