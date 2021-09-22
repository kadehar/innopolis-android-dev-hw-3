import beepers.*;
import cars.Bus;
import cars.Lambo;
import cars.Track;
import cars.Viper;
import doors.AutoDoor;
import doors.Door;
import doors.SpaceshipDoor;
import engines.Engine;
import engines.EngineV12;
import engines.EngineV6;
import engines.FSDEngine;
import transmissions.AutoTransmission;
import transmissions.ManualTransmission;
import transmissions.Transmission;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        track();
        spaceship();
        bus();
        lambo();
    }

    public static void track() {
        Beeper radio = new Radio();
        Transmission manual = new ManualTransmission();
        Engine v6 = new EngineV6();
        List<Door> doors = List.of(new AutoDoor(), new AutoDoor());

        Track track = new Track(radio, v6,
                doors, manual);

        System.out.println("TRACK:");
        System.out.println(track.checkTransmission());
        System.out.println(track.checkEngine());
        System.out.println(track.checkSound());
        System.out.println(track.closeDoor(1));
        track.deliveryGoodsTo("Kazan");
    }

    public static void spaceship() {
        Beeper magic = new MagicSpark();
        Transmission auto = new AutoTransmission();
        Engine fsd = new FSDEngine();
        List<Door> doors = List.of(new SpaceshipDoor());

        Viper viper = new Viper(magic, fsd,
                doors, auto);

        System.out.println("SPACESHIP:");
        System.out.println(viper.checkTransmission());
        System.out.println(viper.checkEngine());
        System.out.println(viper.checkSound());
        System.out.println(viper.closeDoor(0));
        viper.scoopFuel();
        viper.landTo("Mars");
    }

    public static void bus() {
        Beeper horn = new Horn();
        Transmission manual = new ManualTransmission();
        Engine v6 = new EngineV6();
        List<Door> doors = List.of(new AutoDoor(), new AutoDoor(),
                new AutoDoor(), new AutoDoor());

        Bus bus = new Bus(horn, v6,
                doors, manual);

        System.out.println("BUS:");
        System.out.println(bus.checkTransmission());
        System.out.println(bus.checkEngine());
        System.out.println(bus.checkSound());
        System.out.println(bus.closeDoor(1));
        bus.stopAtBusStop();
        bus.goToBusPark();
    }

    public static void lambo() {
        Beeper drums = new Drums();
        Transmission auto = new AutoTransmission();
        Engine v12 = new EngineV12();
        List<Door> doors = List.of(new AutoDoor(), new AutoDoor());

        Lambo lambo = new Lambo(drums, v12,
                doors, auto);

        System.out.println("LAMBO:");
        System.out.println(lambo.checkTransmission());
        System.out.println(lambo.checkEngine());
        System.out.println(lambo.checkSound());
        System.out.println(lambo.closeDoor(1));
    }
}
