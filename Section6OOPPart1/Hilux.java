package Section6OOPPart1;

public class Hilux extends Car01{

    private int roadServiceMonth;

    public Hilux(int wheel, int doors, int gear, boolean isManual, int roadServiceMonth) {
        super("Hilux", "15", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity >=0 && newVelocity <=10) {
            setCurentGear(1);
        } else if (newVelocity >10 && newVelocity <=20) {
            setCurentGear(2);
        } else {
            setCurentGear(4);
        }
    }
}
