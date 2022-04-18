package com.solvd.DeliveryService.model.generic;

import java.security.PrivateKey;

public class DetailsGeneric<A,B,C,D>{
    private A id;
    private B brand;
    private C capability;
    private D speed;

    public DetailsGeneric(){
    }

    public A getId() {
        return id;
    }

    public void setId(A id) {
        this.id = id;
    }

    public D getSpeed() {
        return speed;
    }

    public void setSpeed(D speed) {
        this.speed = speed;
    }

    public B getBrand() {
        return brand;
    }

    public void setBrand(B brand) {
        this.brand = brand;
    }

    public C getCapability() {
        return capability;
    }

    public void setCapability(C capability) {
        this.capability = capability;
    }
}
