package Section7OOPPart2;

public class Table {
    private int chairs;
    private String color;
    private int legs;

    public Table(int chairs, String color, int legs) {
        this.chairs = chairs;
        this.color = color;
        this.legs = legs;
    }

    public int amountOfChairs(int chairs) {
        int setChairs = 0;
        if (chairs > 0) {
            getChairs();
        } else {
            setChairs = 1;
        }
        return getLegs();
    }

    public void theColor(String colour) {
        if (colour != null) {
            getColor();
        }
//        return test;
    }

    public int AmountOfLegs(int legs) {
        if (legs > 0) {
             getLegs();
        } else {
//            legs = 1;
        }

        return getLegs();
    }

    private int getChairs() {
        return chairs;
    }

    private String getColor() {
        return color;
    }

    private int getLegs() {
        return legs;
    }
}
