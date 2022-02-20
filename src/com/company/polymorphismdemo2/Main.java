package com.company.polymorphismdemo2;

import com.company.polymorphismdemo2.entities.ImportedProduct;
import com.company.polymorphismdemo2.entities.Product;
import com.company.polymorphismdemo2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product product1 = new Product("Notebook", 1100.0);
        Product product2 = new UsedProduct("Iphone", 400.00, sdf.parse("15/03/2017"));
        Product product3 = new ImportedProduct("Tablet", 260.00, 20.00);

        System.out.println(product1.priceTag());
        System.out.println(product2.priceTag());
        System.out.println(product3.priceTag());
    }
}
