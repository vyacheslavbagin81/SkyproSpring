import Driver.*;
import Spring.AppConfig;
import Transport.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        Bus bus = context.getBean(Bus.class);
        Pickup pickup = context.getBean(Pickup.class);
        System.out.println(car + " готов к работе");
        System.out.println(bus + " готов к работе");
        System.out.println(pickup + " готов к работе");

        List<Driver> drivers = new ArrayList<>();
        drivers.add(context.getBean(DriverB.class));
        drivers.add(context.getBean(DriverC.class));
        drivers.add(context.getBean(DriverD.class));

        drivers.forEach(driver -> System.out.println(driver.printDriver()));
    }
}
