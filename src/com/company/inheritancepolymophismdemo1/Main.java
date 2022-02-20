package com.company.inheritancepolymophismdemo1;

import com.company.inheritancepolymophismdemo1.entities.Company;
import com.company.inheritancepolymophismdemo1.entities.Individual;
import com.company.inheritancepolymophismdemo1.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TaxPayer> taxPayerList = new ArrayList<TaxPayer>();

        taxPayerList.add(new Individual("Alex", 50000.00, 2000.00));
        taxPayerList.add(new Company("SoftTech", 400000.00, 25));

        for (TaxPayer x : taxPayerList) {
            System.out.println(x);
        }
    }
}
