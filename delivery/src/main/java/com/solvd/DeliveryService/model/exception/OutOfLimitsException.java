package com.solvd.DeliveryService.model.exception;

public class OutOfLimitsException extends RuntimeException {
    public OutOfLimitsException(String messageOutOfLimits) {
        super(messageOutOfLimits);
    }
}
