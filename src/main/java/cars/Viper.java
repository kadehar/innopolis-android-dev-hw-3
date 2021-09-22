package cars;

import beepers.Beeper;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

import java.util.List;

public class Viper extends Car {
    public Viper(Beeper beeper, Engine engine,
                 List<Door> doors, Transmission transmission) {
        super(beeper, engine, doors, transmission);
    }

    public void landTo(String planet) {
        System.out.println("Land to " + planet);
    }

    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }
}
