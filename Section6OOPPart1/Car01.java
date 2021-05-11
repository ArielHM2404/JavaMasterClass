package Section6OOPPart1;

public class Car01 extends Vehicule{

    private int wheel;
    private  int doors;
    private int gear;
    private  boolean isManual;
    private int curentGear;

    public Car01(String name, String size, int wheel, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.curentGear = 1;
    }

    public void setCurentGear(int curentGear) {
        this.curentGear = curentGear;
        System.out.println("Car.setCurrentGear(): changed to "+ this.curentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity" + speed +" Direction: " +direction);
    }

//    @Override
//    public void stop(){
//        super.stop();
//    }

}
