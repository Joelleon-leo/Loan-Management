package com.example.demo;

public class Customer{
    private int customerId;
    private String customerName;
    private int customerAge;
    private int phoneNumber;
    private int balance;

    public Customer(int customerId,String customerName,int customerAge,int phoneNumber,int balance){
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAge = customerAge;
        this.phoneNumber = phoneNumber;
        this.balance=balance;
    }

     public int getCustomerId(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public int getCustomerAge(){
        return customerAge;
    }
    
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getbalance(){
        return balance;
    }
}
    
