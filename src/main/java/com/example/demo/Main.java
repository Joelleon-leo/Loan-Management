package com.example.demo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Operation to perform");
    System.out.println("1. Deposit");
    System.out.println("2. Check Balance");
    System.out.println("3. Withdrawal");
    System.out.println("4. Add new Customer");
    System.out.println("5. Exit");
    
    int choice = sc.nextInt();
    switch(choice){
       case 4:
        System.out.println("Enter Customer Id");
        int customerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name");
        String customerName = sc.nextLine();
        System.out.println("Enter Customer Age");
        int customerAge = sc.nextInt();
        System.out.println("Enter Customer Phone Number");
        int phoneNumber = sc.nextInt();
        System.out.println("Enter initial balance");
        int balance = sc.nextInt();
        Customer c1= new Customer(customerId,customerName,customerAge,phoneNumber,balance);
    }


}
}