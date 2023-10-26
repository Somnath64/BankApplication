package com.csi.services;

import java.util.Scanner;

public class CustomerServices {

    int accBalance = 10000, amount, custOTP, genratedOTP;
    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        displayAccBalance();
        System.out.println("Enter deposit amount");
        int amount = scanner.nextInt();
        accBalance += amount;
        System.out.println("Successfully deposited amount");
        displayAccBalance();
    }

    public void withdraw() {
        displayAccBalance();
        System.out.println("Enter withdraw amount");
        int amount = scanner.nextInt();
        if (amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Successfully withdrawal amount");
            displayAccBalance();
        } else {
            System.out.println("Withdraw amount is greater than available Balance, Please enter valid amount");
        }

    }

    public void transfer() {
        displayAccBalance();
        genratedOTP = generateOTP();

        System.out.println("Please enter OTP : " + genratedOTP);

        custOTP = scanner.nextInt();

        if (custOTP == genratedOTP) {
            displayAccBalance();
            System.out.println("Please enter transfer amount");
            amount = scanner.nextInt();
            if (amount <= accBalance) {

                accBalance -= amount;
                displayAccBalance();
            } else {
                System.out.println("Transfer amount is grater than available balance, Please enter valid amount");
            }
        } else {
            System.out.println("Enter valid OTP");
        }


    }

    public void logout() {
        System.out.println("Logout");
        System.exit(0);
    }

    public void displayAccBalance() {
        System.out.println("Current balance available : " + accBalance);
    }

    public int generateOTP() {
        return (int) (Math.random() * 10000 + 1);
    }

}
