package com.csi.controller;

import com.csi.model.Customer;
import com.csi.services.CustomerServices;

import java.util.Scanner;

public class CustomerController {
    public static void main(String[] args) {
        Customer customer = new Customer(12345, "password");
        CustomerServices service = new CustomerServices();
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        do {
            System.out.println("Enter Credentials ");


            long custAccountNumber = scanner.nextLong();
            String custPassword = scanner.next();

            if (custAccountNumber == customer.getCustAccNo() && custPassword.equals(customer.getCustPassword())) {
                System.out.println("Welcome to Indian Bank");
                flag = false;
            } else {
                System.out.println("Invalid Credentials, please enter valid credentials");
                flag = true;
            }
        } while (flag);

        do {
            System.out.println("\n 1. Deposite \n 2. Withdraw \n 3. Transfer \n 4. Logout");
            System.out.println("Choose Option");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    service.deposit();
                    break;
                case 2:
                    service.withdraw();
                    break;
                case 3:
                    service.transfer();
                    break;
                case 4:
                    service.logout();
                    break;
                default:
                    System.out.println("Please Enter valid option");
                    break;
            }
        } while (true);
    }
}
