package proxy;

public class Roll implements Engine{
    private String carName;

    public Roll(String carName) {
        this.carName = carName;
    }

    @Override
    public void startEngine() {
        System.out.println(carName + "has been started");
    }
}
