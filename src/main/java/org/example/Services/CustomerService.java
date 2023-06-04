package org.example.Services;

import org.example.model.Customer;
import org.example.model.Product;

public interface CustomerService {
    String addToCart(Product product, Customer customer);
}
