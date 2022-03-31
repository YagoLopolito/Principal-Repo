package com.solvd.DeliveryService.model.exceptions;

public class OutOfLimitsException extends RuntimeException{
    public OutOfLimitsException(String messageOutOfLimits) {
        super(messageOutOfLimits);
    }
}
