package com.solvd.DeliveryService.model.people;

import com.solvd.DeliveryService.model.interface1.IPay;
import com.solvd.DeliveryService.model.store.Order;

public class Client extends Person implements IPay {
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
        System.out.println("I pay: ");
    }
}

