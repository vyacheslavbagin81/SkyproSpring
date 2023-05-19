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

        System.out.println();

        List<Driver> drivers = new ArrayList<>();
        drivers.add(context.getBean("driverB",Driver.class));
        drivers.add(context.getBean("driverC",Driver.class));
        drivers.add(context.getBean("driverD",Driver.class));

        drivers.forEach(driver -> System.out.println(driver.printDriver()));
    }
}
