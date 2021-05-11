package Section7OOPPart2;

public class TV {
    private int size;
    private String brand;
    private String model;

    public TV(int size, String brand, String model) {
        this.size = size;
        this.brand = brand;
        this.model = model;
    }

    public boolean turnTVOn(boolean on) {
        if (on) {
            System.out.println("TV is on");

        }
        return on;
    }

    public void changeChannel(int channel) {
        System.out.println("TV is on Channel: " + channel);
    }

    public void changeVolume(int volume) {
        System.out.println("Volume is: "+ volume);
    }
}
