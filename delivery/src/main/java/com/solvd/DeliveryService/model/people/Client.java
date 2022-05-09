package com.solvd.DeliveryService.model.people;

import com.solvd.DeliveryService.model.interface1.IPay;
import com.solvd.DeliveryService.model.store.Order;
import com.solvd.DeliveryService.util.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client extends Person implements IPay {
    private static final Logger log = LogManager.getLogger(Runner.class);
    private Order order;
    private Client client;
    private int packageWeight;

    public Client(int age, String sex, int document, String name) {
        super(age, sex, document, name);
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
        return getName()
                + "!"
                + "\n";
    }

    @Override
    public void pay() {
        log.info("I pay: " + order.calculateCost(packageWeight));
    }
}

