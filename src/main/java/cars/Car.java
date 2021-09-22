package cars;

import beepers.Beeper;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

import java.util.List;

public abstract class Car {
    private Beeper beeper;
    private Engine engine;
    private List<Door> doors;
    private Transmission transmission;

    public Car(Beeper beeper, Engine engine,
               List<Door> doors, Transmission transmission) {
        this.beeper = beeper;
        this.engine = engine;
        this.doors = doors;
        this.transmission = transmission;
    }

    public String openDoor(int door) {
        return doors.get(door).openDoor();
    }

    public String closeDoor(int door) {
        return doors.get(door).closeDoor();
    }

    public String checkEngine() {
        return engine.makeRotation();
    }

    public String checkSound() {
        return beeper.makeSound();
    }

    public String checkTransmission() {
        return transmission.switchTransmission();
    }
}
