package org.example.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static ArrayList<Product> products;

    public Store() {

       products = new ArrayList<>();
    }

    public void loadProductsFromFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String productName = parts[0];
                double productPrice = Double.parseDouble(parts[1]);
                String productId = parts[2];
                String productModel = parts[3];
                Product product = new Product(productName, productPrice, productId, productModel);
                products.add(product);
            }
            scanner.close();
            System.out.println();
            System.out.println("Available Product in the store");
            System.out.println(products);
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e);
        }

    }

    /*public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getProductName() + ": $" + product.getProductprice() + " - " + product.getProductID() + " - " + product.getProductModel());
        }
    }*/

   // public static void main(String[] args) {
/*        Store store = new Store();
        store.loadProductsFromFile("products.csv");
        //store.displayProducts();


        Manager manager = new Manager("Wajiu", "ID344", "09039156872", "ETP", "Manager");



        Cashier cashier1 = new Cashier("Bello", "eehgg","ETP","ETP","Cashier",5);
        Cashier cashier2 = new Cashier("omolola", "eehgg","ETP","ETP","Cashier",2);
        Cashier cashier3 = new Cashier("Wale","ht687","ETP","Lagos","Cashier",3);
        Cashier cashier4 = new Cashier("Eben","ht687","ETP","Abuja","cashier",4);

        ManagerServices managerServices = new ManagerServices();
        managerServices.hireCashier(cashier1,manager);
        managerServices.hireCashier(cashier2,manager);
        managerServices.hireCashier(cashier3,manager);
        managerServices.hireCashier(cashier4,manager);
        //managerServices.listCashiers(manager);

        //Cashier cashier1 = new Cashier("Bello", "ID3453", "08107293453", "ETP", "Cashier");
        //Cashier cashier2 = new Cashier("Olarewaju", "ID3453", "08107293453", "ETP", "Cashier");


       // ManagerServices managerServices = new ManagerServices();
        //managerServices.hireCashier(cashier1, manager);
        //managerServices.hireCashier(cashier2, manager);
        //managerServices.listCashiers(manager);


// Customer buy product base on their wallet if it's sufficient with total price of product in their cart
        Customer customer = new Customer("Omolola", "ID443", "855748734",10000000);
        Product product1 = store.products.get(2);
        Product product2 = store.products.get(1);



        Customer customer11 = new Customer("Ebenezer","455TT","090567463332",155000);
        Product product3 = store.products.get(5);
        Product product4 = store.products.get(1);

        CustomerServices customerServices = new CustomerServices();
        customerServices.addToCart(product1, customer);
        customerServices.addToCart(product2, customer);
        customerServices.addToCart(product3,customer11);
        customerServices.addToCart(product4,customer11);


        // Creating object for receipt generating for each customer
        CashierServices cashierServices = new CashierServices();
        cashierServices.generateReceipt(customer, (ArrayList<Product>) customer.getCart());
        cashierServices.generateReceipt(customer11,(ArrayList<Product>) customer11.getCart());


    }*/
}





