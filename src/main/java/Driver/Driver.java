package Driver;

import Transport.*;

public class Driver {
    private final String name;
    private final Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String printDriver() {
        return name + " сел за руль " + transport.getModel();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
