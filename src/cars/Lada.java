package cars;

public class Lada implements CarFactoryInterface{
    @Override
    public void honk() {
        System.out.println("Lada honks");
    }
}
