package org.example.model;

import org.example.model.BaseClass;

public class Cashier extends BaseClass{
    private Integer rating;
    public Cashier(String staffName, String staffID, String staffPhone, String staffAddress, String staffRoles,Integer rating) {
        super(staffName, staffID, staffPhone, staffAddress, staffRoles);
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }
}