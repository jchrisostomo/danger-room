package com.company.entities;

import com.company.entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contractList = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contractList.add(contract);
    }

    public void removeContract(HourContract contract) {
        contractList.remove(contract);
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

        public Double income(int year, int month) {
        Double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contractList) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH) + 1;
            if (year == c_year && month == c_month) {
                sum += c.totalValue()*c.getHours();
            }
        }
        return sum;
    }
}
