package com.company.stringbuilderdemo;

import com.company.stringbuilderdemo.entities.Client;
import com.company.stringbuilderdemo.entities.Order;
import com.company.stringbuilderdemo.entities.OrderItem;
import com.company.stringbuilderdemo.entities.Product;
import com.company.stringbuilderdemo.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product product1 = new Product("TV",1000.00);
        Product product2 = new Product("Shaver",80.00);

        Client client = new Client("Alex Full","guile@gmail.com", sdf.parse("15/03/1985"));

        OrderItem orderItem1 = new OrderItem(1,1000.00, product1);
        OrderItem orderItem2 = new OrderItem(1,80.00, product1);

        Order order = new Order(new Date(), OrderStatus.PROCESSING, client);

        order.addItem(orderItem1);
        order.addItem(orderItem2);

        System.out.println("----------------------------------------");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(client);
        System.out.println(orderItem1);
        System.out.println(orderItem2);
        System.out.println("----------------------------------------");
        System.out.println(order);


    }
}
