package beepers;

public class Radio implements Beeper {
    @Override
    public String makeSound() {
        return "Don't act like an angel! You're falling again!";
    }
}
