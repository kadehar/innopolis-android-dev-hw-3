package cars;

import beepers.Beeper;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

import java.util.List;

public class Track extends Car {
    public Track(Beeper beeper, Engine engine,
                 List<Door> doors, Transmission transmission) {
        super(beeper, engine, doors, transmission);
    }

    public void deliveryGoodsTo(String city) {
        System.out.println("Delivering to " + city);
    }
}
