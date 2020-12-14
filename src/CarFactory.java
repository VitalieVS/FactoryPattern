import cars.Audi;
import cars.BMW;
import cars.CarFactoryInterface;
import cars.Lada;

public class CarFactory {

    public CarFactoryInterface getCar(String car) {
        if (car == null) {
            return null;
        }
        if (car.equalsIgnoreCase("BMW")) {
            return new BMW();
        }
        if (car.equalsIgnoreCase("Audi")) {
            return new Audi();
        }
        if (car.equalsIgnoreCase("Lada")) {
            return new Lada();
        }
        if (car.equalsIgnoreCase("Mercedes")) {
            return new BMW();
        }
        return null;
    }
}
