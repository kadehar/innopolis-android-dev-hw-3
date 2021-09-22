package transmissions;

public class ManualTransmission implements Transmission {
    @Override
    public String switchTransmission() {
        return "Switch by my hand!";
    }
}
