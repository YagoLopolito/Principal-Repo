package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.EnumColour;
import com.solvd.DeliveryService.model.enum1.EnumTypeOfLine;
import com.solvd.DeliveryService.model.enum1.EnumVehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.INoReparable;
import com.solvd.DeliveryService.util.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck extends Vehicle implements INoReparable {
    private static final Logger log = LogManager.getLogger(Runner.class);
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(int id, String brand, boolean hasTrailer, double capability, int speed) {
        super(id, brand, capability, speed);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "\n"
                + EnumVehicles.TRUCK.getVehicle()
                + ":"
                + "\n"
                + super.toString()
                + ", Has trailer: "
                + hasTrailer
                + ", Colour: "
                + EnumColour.ORANGE.getColour()
                + ", Range: "
                + EnumTypeOfLine.MID_RANGE.getTypeOfLine()
                + "\n";
    }


    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void noReparable() {
        log.info("\nThe truck can´t be repaired in the garage, we have to take it to a truck mechanic.");
    }
}