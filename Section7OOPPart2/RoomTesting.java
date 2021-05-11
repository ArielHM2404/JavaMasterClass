package Section7OOPPart2;

public class RoomTesting {

    public static void main(String[] args) {

//        Table table = new Table(5,"brown", 4);
//        TV tv = new TV(65,"LG", "G65K");
//        Sofa sofa = new Sofa(30, 55, 6, "Blue");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 65);
        Bed bed = new Bed("Classic",4, 5, 3, 1);
        Lamp lamp = new Lamp("Modern", false, 75);

        Bedroom bedroom = new Bedroom("Ariel",wall1, wall2, wall3, wall4, bed, lamp, ceiling);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
