package engines;

public class FSDEngine implements Engine {
    @Override
    public String makeRotation() {
        return "60ly/s";
    }

    public String prepareFSD() {
        return "Prepared";
    }
}
