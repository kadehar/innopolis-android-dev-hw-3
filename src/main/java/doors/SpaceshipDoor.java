package doors;

public class SpaceshipDoor implements Door {
    @Override
    public String openDoor() {
        return "Open spaceship door!";
    }

    @Override
    public String closeDoor() {
        return "Close spaceship door!";
    }
}
