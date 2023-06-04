package org.example.Services;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Store;

import java.util.ArrayList;

public class CashierServices implements CashierService {
    @Override
    public String generateReceipt(Customer customer, ArrayList<Product> cart) {
        System.out.println("============Reciept for "+ customer.getCustomerName() + "===============");
        // System.out.println("Receipt for " + customer.getCustomerName() + ":");
        double total = 0;
        for (Product product : cart) {
            System.out.println(product.getProductName() + ": $" + product.getProductprice() + " - " + product.getProductID() + " - " + product.getProductModel());
            System.out.println("-----------------------------------");
            total += product.getProductPrice();
        }
        if (customer.getCustomerWallet() > total) {
            System.out.println("Total: $" + total);
            System.out.println("===================================");
        }else {
            System.out.println("Customer wallet is insufficient");
            System.out.println("===================================");
            System.out.println("Thanks for patronise");
        }
        return null;
    }

    @Override
    public String sellProduct(Customer customer, Product product, Store store) {
        System.out.println("Sold " + product.getProductName() + " to " + customer.getCustomerName());

        return null;
    }



    /*public void generateReceipt(Customer customer, ArrayList<Product> cart) {
        System.out.println("============Reciept for "+ customer.getCustomerName() + "===============");
       // System.out.println("Receipt for " + customer.getCustomerName() + ":");
        double total = 0;
        for (Product product : cart) {
            System.out.println(product.getProductName() + ": $" + product.getProductprice() + " - " + product.getProductID() + " - " + product.getProductModel());
            System.out.println("-----------------------------------");
            total += product.getProductPrice();
            }
        if (customer.getCustomerWallet() > total) {
            System.out.println("Total: $" + total);
            System.out.println("=============== "+ customer.getDateTime() +" ====================");
        }else {
            System.out.println("Customer wallet is insufficient");
            System.out.println("===================================");
            System.out.println("Thanks for patronise");
        }
    }

    public static void sellProduct(Customer customer, Product product, Store store) {
            System.out.println("Sold " + product.getProductName() + " to " + customer.getCustomerName());

        }*/
    }


