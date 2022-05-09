package com.solvd.DeliveryService.model.enum1;

public enum EnumColour {
    YELLOW(1, "Yellow"),
    ORANGE(2, "Orange"),
    RED(3, "Red"),
    WHITE(4, "White"),
    WHITE_ICE(5, "White Ice");
    private final int number;
    private final String Colour;

    EnumColour(int number, String colour) {
        this.number = number;
        Colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return Colour;
    }
}
