package com.dvorianchicov.test.testPlugin.models;

public class Employee extends Human{

    String company;

    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
