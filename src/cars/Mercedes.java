package cars;

public class Mercedes implements CarFactoryInterface {
    @Override
    public void honk() {
        System.out.println("Mercedes honks");
    }
}
