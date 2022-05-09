package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.EnumColour;
import com.solvd.DeliveryService.model.enum1.EnumTypeOfLine;
import com.solvd.DeliveryService.model.enum1.EnumVehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IRepair;
import com.solvd.DeliveryService.util.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SUV extends Vehicle implements IRepair {
    private static final Logger log = LogManager.getLogger(Runner.class);
    private DetailsGeneric<Integer, String, Double, Integer> details;

    public SUV() {
    }

    public SUV(int id, String brand, double capability, int speed) {
        super(id, brand, capability, speed);

    }

    @Override
    public String toString() {

        return "\n"
                + EnumVehicles.SUV.getVehicle()
                + ":"
                + "\n"
                + super.toString()
                + ", Colour: "
                + EnumColour.WHITE.getColour()
                + ", Range: "
                + EnumTypeOfLine.LOW_RANGE.getTypeOfLine()
                + "\n";
    }

    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable(String nameMechanic) {
        log.info("Repair in the garage by: ");
    }
}
