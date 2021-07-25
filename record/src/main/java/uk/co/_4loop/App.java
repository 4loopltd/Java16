package uk.co._4loop;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import uk.co._4loop.record.employee.Employee;
import uk.co._4loop.record.employee.EmployeeRecord;
import uk.co._4loop.record.temperature.TemperatureClazz;
import uk.co._4loop.record.temperature.TemperatureRecord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Slf4j
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    @SneakyThrows
    public static void main(final String[] args) {

        // A record is a named collection of data that has no need for encapsulation (nominal tuple).

        // Old vs New
        TemperatureClazz tempA = new TemperatureClazz(32, 25);
        log.info(tempA.toString());
        log.info("High {}", tempA.getHigh());
        log.info("Low {}", tempA.getLow());

        TemperatureRecord tempB = new TemperatureRecord(32, 25);
        log.info(tempB.toString());
        log.info("High {}", tempB.high());
        log.info("Low {}", tempB.low());


        // Serialised
        final String file = "employees.bin";
        try (var out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(new EmployeeRecord("Phil", "Milne"));
            out.writeObject(new EmployeeRecord("Foo", "Bar"));
            out.writeObject(null);
        }

        try (var in = new ObjectInputStream(new FileInputStream(file))) {
            Employee e;
            while ((e = (Employee) in.readObject()) != null) {
                log.info("Employee:{}", e);
            }
        }
    }
}
