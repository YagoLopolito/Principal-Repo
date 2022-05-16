package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.EnumColour;
import com.solvd.DeliveryService.model.enum1.EnumTypeOfLine;
import com.solvd.DeliveryService.model.enum1.EnumVehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IRepair;
import com.solvd.DeliveryService.model.store.Garage;
import com.solvd.DeliveryService.util.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pickup extends Vehicle implements IRepair {
    private static final Logger log = LogManager.getLogger(Runner.class);
    private boolean hasTruckBed;

    public Pickup() {
    }

    public Pickup(int id, String brand, double capability, boolean hasTruckBed, int speed) {
        super(id, brand, capability, speed);
        this.hasTruckBed = hasTruckBed;
    }

    public boolean isHasTruckBed() {
        return hasTruckBed;
    }

    public void setHasTruckBed(boolean hasTruckBed) {
        this.hasTruckBed = hasTruckBed;
    }

    @Override
    public String toString() {
        return "\n"
                + EnumVehicles.PICKUP.getVehicle()
                + ":"
                + "\n"
                + super.toString()
                + ", Colour: "
                + EnumColour.WHITE_ICE.getColour()
                + ", Range: "
                + EnumTypeOfLine.TOP_OF_THE_LINE.getTypeOfLine()
                + "\n";

    }

    Garage garage = new Garage();

    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable() {
        log.info("\nThe pickup can be repaired in the garage.");
    }
}

