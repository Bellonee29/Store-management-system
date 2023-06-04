package org.example.model;

import org.example.model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private  String customerID;
    private String customerPhone;
    private List<Product> cart;
    private Integer customerWallet;

    public Customer(String customerName, String customerID, String customerPhone,Integer customerWallet) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
        this.customerWallet = customerWallet;
        cart = new ArrayList<>();
    }



    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getCart() {
        return cart;
    }

    public Integer getCustomerWallet() {
        return customerWallet;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", customerID='" + customerWallet + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", Cart=" + cart +
                '}';
    }
}