package org.example.Services;

import org.example.model.Cashier;
import org.example.model.Manager;

public interface ManagerService {
    String hireCashier (Cashier cashier, Manager manager);
    String listCashiers (Manager manager);
}
