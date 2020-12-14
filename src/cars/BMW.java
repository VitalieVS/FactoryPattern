package cars;

public class BMW implements CarFactoryInterface {
    @Override
    public void honk() {
        System.out.println("BMW honks");
    }
}
