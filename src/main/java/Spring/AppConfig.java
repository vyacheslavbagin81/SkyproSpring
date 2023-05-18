package Spring;

import Driver.*;
import Transport.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Transport getCarBean() {
        return new Car("Audi");
    }

    @Bean(name = "bus")
    public Transport getBusBean() {
        return new Bus("PAZ");
    }

    @Bean(name = "pickup")
    public Transport getPickupBean() {
        return new Pickup("KAMAZ");
    }

    @Bean(name = "driverB")
    public DriverB getDriverB() {
        return new DriverB("Vasiliy", getCarBean());
    }

    @Bean(name = "driverC")
    public DriverC getDriverC() {
        return new DriverC("Petr", getPickupBean());
    }

    @Bean(name = "driverD")
    public DriverD getDriverD() {
        return new DriverD("Ivan", getBusBean());
    }
}
