package beepers;

public class Drums implements Beeper {
    @Override
    public String makeSound() {
        return "BUM! BUM! BUM!";
    }
}
