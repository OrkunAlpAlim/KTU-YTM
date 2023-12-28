public class Home {
    private AirConditioner airConditioner;
    private Light light;
    private Door door;
    private Television smartTV;

    public Home() {
        airConditioner = new AirConditioner();
        light = new Light();
        door = new Door();
        smartTV = new Television();
    }

    public void leaveHome() {
        airConditioner.turnOff();
        light.turnOff(0);
        light.turnOff(1);
        door.lock();
    }

    public void enterHome() {
        door.unlock();
        light.turnOn(0);
        light.turnOn(1);
        airConditioner.turnOn();
    }

    public void updateTemperature(int temperature) {
        airConditioner.update(temperature);
    }

    public void turnOnTelevision() {
        smartTV.turnOn();
    }

    public void turnOffTelevision() {
        smartTV.turnOff();
    }

    public void increaseVolume() {
        smartTV.increaseVolume();
    }

    public void decreaseVolume() {
        smartTV.decreaseVolume();
    }

    public void changeChannel(int channel) {
        smartTV.changeChannel(channel);
    }

    public void increaseChannel() {
        smartTV.increaseChannel();
    }

    public void decreaseChannel() {
        smartTV.decreaseChannel();
    }

    public void turnOffAirConditioners() {
        airConditioner.turnOff();
    }

    public void turnOnAirConditioners() {
        airConditioner.turnOn();
    }

    public void turnOffLights() {
        light.turnOff(0);
        light.turnOff(1);
    }

    public void turnOnLights() {
        light.turnOn(0);
        light.turnOn(1);
    }

    public void lockDoors() {
        door.lock();
    }

    public void unlockDoors() {
        door.unlock();
    }
}
