package Transport;

public abstract class Transport {
    private final String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}
