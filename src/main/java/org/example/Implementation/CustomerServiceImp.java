package org.example.Implementation;

import org.example.Services.CustomerService;
import org.example.model.Customer;
import org.example.model.Product;


public class CustomerServiceImp implements CustomerService {


    @Override
    public String addToCart(Product product,Customer customer) {

        customer.getCart().add(product);
        return null;
    }
}
