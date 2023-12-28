public class AirConditioner {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public AirConditioner() {
    }

    public void turnOn() {
        temperature = 20;
        System.out.println("Air conditioner is turned on.");
    }

    public void turnOff() {
        System.out.println("Air conditioner is turned off.");
    }

    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature updated: " + temperature + "°C");
    }
}
