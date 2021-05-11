package Section7OOPPart2;

public class CompositionTesting {

    public static void main(String[] args) {
        Dimension dimensions = new Dimension(35, 25, 30);
        Case theCase = new Case("220B", "Dell","240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard moterhBoard = new Motherboard("BJ-200", "Asus", 4, 4, "V2.44");
        PC thePC = new PC(theCase, monitor, moterhBoard);
//        thePC.getMonitor().drawPixelAt(200, 15, "Blue");
//        thePC.getMotherboard().loadProgram("Windows");
//        thePC.getTheCase().pressPowerbtn();
        thePC.powerUp();
    }
}
