package doors;

public class AutoDoor implements Door {
    @Override
    public String openDoor() {
        return "Open auto door!";
    }

    @Override
    public String closeDoor() {
        return "Close auto door!";
    }
}
