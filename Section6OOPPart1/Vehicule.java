package Section6OOPPart1;

public class Vehicule {
//    private Boolean isManual;
    private String name;
    private String size;
    private int currentDirection;
    private  int currentVelocity;

    public Vehicule(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicule.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void stop() {
        currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicule.move(): Moving at "+ currentVelocity +" in direction " + currentDirection);
    }
}
