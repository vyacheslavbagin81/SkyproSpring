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
    public Driver getDriverB() {
        return new Driver("Vasiliy", getCarBean());
    }

    @Bean(name = "driverC")
    public Driver getDriverC() {
        return new Driver("Petr", getPickupBean());
    }

    @Bean(name = "driverD")
    public Driver getDriverD() {
        return new Driver("Ivan", getBusBean());
    }
}
