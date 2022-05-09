package com.solvd.DeliveryService.model.generic;

public class GenricInteger<A> {
    private final A integer;

    public GenricInteger(A integer) {
        this.integer = integer;
    }

    public A getInteger() {
        return integer;
    }
}
