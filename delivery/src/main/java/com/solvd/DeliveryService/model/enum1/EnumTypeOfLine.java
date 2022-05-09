package com.solvd.DeliveryService.model.enum1;

public enum EnumTypeOfLine {
    TOP_OF_THE_LINE(1, "Top of the Line"),
    MID_RANGE(2, "Mid Range"),
    LOW_RANGE(3, "Low Range");

    private final int number;
    private final String TypeOfLine;

    EnumTypeOfLine(int number, String typeOfLine) {
        this.number = number;
        TypeOfLine = typeOfLine;
    }

    public int getNumber() {
        return number;
    }

    public String getTypeOfLine() {
        return TypeOfLine;
    }
}
