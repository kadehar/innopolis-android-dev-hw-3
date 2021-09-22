package cars;

import beepers.Beeper;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

import java.util.List;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine,
                 List<Door> doors, Transmission transmission) {
        super(beeper, engine, doors, transmission);
    }
}
