public class Light {
    private boolean state[];

    public Light() {
        state = new boolean[3];
    }

    public void turnOn(int light) {
        state[light] = true;
        System.out.println(light + ". light is turned on.");
    }

    public void turnOff(int light) {
        state[light] = false;
        System.out.println(light + ". light is turned off.");
    }
}