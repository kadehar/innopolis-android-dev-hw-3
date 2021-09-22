package cars;

import beepers.Beeper;
import doors.Door;
import engines.Engine;
import fuel.FuelType;
import transmissions.Transmission;

import java.util.List;

public class Bus extends Car {
    public Bus(Beeper beeper, Engine engine, List<Door> doors,
               Transmission transmission, FuelType fuel) {
        super(beeper, engine, doors,
                transmission, fuel);
    }

    public void goToBusPark() {
        System.out.println("Going to a bus park...");
    }

    public void stopAtBusStop() {
        System.out.println("Stopping at a bus stop...");
    }
}
