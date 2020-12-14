import cars.CarFactoryInterface;

public class Main {
    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();

        CarFactoryInterface car1 = carFactory.getCar("BMW");
        car1.honk();

        CarFactoryInterface car2 = carFactory.getCar("audi");
        car2.honk();
    }
}
