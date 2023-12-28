public class Television {
    private int volumeLevel;
    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    private int channel;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public Television() {
    }

    public void turnOn() {
        volumeLevel = 0;
        channel = 1;
        System.out.println("Television is turned on.");
    }

    public void turnOff() {
        System.out.println("Television is turned off.");
    }

    public void increaseVolume() {
        volumeLevel++;
        System.out.println("Volume up.");
    }

    public void decreaseVolume() {
        volumeLevel--;
        System.out.println("Volume down.");
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel changed to: " + channel);
    }

    public void increaseChannel() {
        channel++;
        System.out.println("Next channel.");
    }

    public void decreaseChannel() {
        channel--;
        System.out.println("Previous channel.");
    }
}
