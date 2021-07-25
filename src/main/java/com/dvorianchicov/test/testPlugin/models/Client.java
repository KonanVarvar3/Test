package com.dvorianchicov.test.testPlugin.models;

public class Client extends Human{

    String phone;

    public Client(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
