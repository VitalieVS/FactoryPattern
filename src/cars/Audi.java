package cars;

public class Audi implements CarFactoryInterface {
    @Override
    public void honk() {
        System.out.println("Audi Honks");
    }
}
