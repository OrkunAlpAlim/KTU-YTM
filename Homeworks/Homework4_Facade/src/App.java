public class App {
    public static void main(String[] args) throws Exception {
        Home home = new Home();
        home.enterHome();
        home.updateTemperature(28);
        home.turnOnTelevision();
        home.increaseChannel();
        home.decreaseChannel();
        home.increaseVolume();
        home.decreaseVolume();
        home.turnOffTelevision();
        home.turnOffAirConditioners();
        home.turnOffLights();
        home.lockDoors();
        home.leaveHome();
    }
}
