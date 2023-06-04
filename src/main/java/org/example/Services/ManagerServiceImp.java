package org.example.Services;

import org.example.model.Cashier;
import org.example.model.Manager;

public class ManagerServiceImp implements ManagerService {
    @Override
    public String hireCashier(Cashier cashier, Manager manager) {
            manager.getCashiers().add(cashier);;
            if (cashier.getRating() >= 4 )
                System.out.println("Cashier " + cashier.getStaffName() + " has been hired.");

            return null;
    }

    @Override
    public String listCashiers(Manager manager) {
        System.out.println("Current Cashiers:");
        System.out.println();
        for (Cashier cashier : manager.getCashiers()) {
            System.out.println(cashier);
        }
        return null;
    }


    /*public String hireCashier(Cashier cashier, Manager manager) {
            manager.getCashiers().add(cashier);;
         if (cashier.getRating() >= 4 )
            System.out.println("Cashier " + cashier.getStaffName() + " has been hired.");

        return null;
    }
    public String listCashiers(Manager manager) {
        System.out.println("Current Cashiers:");
        System.out.println();
        for (Cashier cashier : manager.getCashiers()) {
            System.out.println(cashier);
        }

        return null;
    */

}
