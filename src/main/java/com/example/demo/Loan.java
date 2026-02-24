package com.example.demo;

public class Loan {

    private Customer customer;   
    private double balance;

    public Loan(int loanId, Customer customer,
                double balance){
        this.customer = customer;
        this.balance = balance;
    }

    public void makePayment(double amount){

        if(amount>balance){
            System.out.println(customer.getCustomerName() +" Your bank balance is only " + balance + " . Please enter a valid amount");
        }
        else if(amount>0){
            balance -= amount;
            System.out.println("Payment done. Balance: " + balance);
        }else{
            System.out.println("Invalid Payment");
        }
    }

    public double getBalance(){
        return balance;
    }
}