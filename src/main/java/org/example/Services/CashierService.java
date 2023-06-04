package org.example.Services;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Store;

import java.util.ArrayList;

public interface CashierService {
    String generateReceipt (Customer customer, ArrayList<Product> cart);
    String sellProduct (Customer customer, Product product, Store store);
}
