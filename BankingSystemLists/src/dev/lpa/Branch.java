package dev.lpa;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        for( var customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        var customer = findCustomer(customerName);
        if (customer == null){
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        System.out.println("Użytkownik o imieniu " + customerName + " juz istnieje!");
        return false;
    }

    public  boolean addCustomerTransaction(String customerName, double transaction) {
        var customer = findCustomer(customerName);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

}
