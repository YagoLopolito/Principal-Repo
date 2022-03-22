package com.solvd.deliveryService.people;

import com.solvd.deliveryService.Order;
import com.solvd.deliveryService.interfaces.Pay;

public class Client extends Person implements Pay {
    private Order order;

    public Client(int age, String sex, int document, String name, Order order) {
        super(age, sex, document, name);
        this.order = order;
    }


    public Order getTransport() {
        return order;
    }

    public void setTransport(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order: " + order +
                super.toString() + "\n";
    }

    @Override
    public void pay() {

    }
}

