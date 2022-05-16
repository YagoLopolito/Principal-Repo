package com.solvd.DeliveryService.model.vehicle;

import com.solvd.DeliveryService.model.enum1.EnumColour;
import com.solvd.DeliveryService.model.enum1.EnumTypeOfLine;
import com.solvd.DeliveryService.model.enum1.EnumVehicles;
import com.solvd.DeliveryService.model.generic.DetailsGeneric;
import com.solvd.DeliveryService.model.interface1.IRepair;
import com.solvd.DeliveryService.util.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Motorcycle extends Vehicle implements IRepair {
    private static final Logger log = LogManager.getLogger(Runner.class);
    private boolean hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(int id, String brand, boolean hasSidecar, double capability, int speed) {
        super(id, brand, capability, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "\n"
                + EnumVehicles.MOTORCYCLE.getVehicle()
                + ":"
                + "\n"
                + super.toString()
                + ", Colour: "
                + EnumColour.RED.getColour()
                + ", Range: "
                + EnumTypeOfLine.TOP_OF_THE_LINE.getTypeOfLine()
                + "\n";
    }


    @Override
    public void setDetails(DetailsGeneric details) {

    }

    @Override
    public void repairable() {
        log.info("\nThe motorcycle can be repaired in the garage.");
    }
}
