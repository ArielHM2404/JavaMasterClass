package Section7OOPPart2;

public class PrinterTester {
    public static void main(String[] args) {
        Printer printer = new Printer("Cannon x01", 95,0,true);

//        printer.fillUpToner(10);
//        System.out.println(printer.fillUpToner(10));
//        System.out.println(printer.getTonerLevel());
//        printer.printPages(15, true);
        System.out.println(printer.printPages(15, true));
        System.out.println(printer.printPages(15, false));
    }
}
