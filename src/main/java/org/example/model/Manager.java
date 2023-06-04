package org.example.model;

import org.example.model.BaseClass;

import java.util.ArrayList;

public class Manager extends BaseClass {
    private ArrayList<Cashier> cashiers;
    public Manager(String staffName, String staffID, String staffPhone, String staffAddress, String staffRoles) {
        super(staffName, staffID, staffPhone, staffAddress, staffRoles);
        this.cashiers = new ArrayList<>();
    }

    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }
}
