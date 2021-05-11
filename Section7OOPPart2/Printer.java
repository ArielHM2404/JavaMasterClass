package Section7OOPPart2;

public class Printer {
    private String model;
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplexPrinter;

    public Printer(String model, int tonerLevel, int numberOfPages, boolean isDuplexPrinter) {
        this.model = model;
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.isDuplexPrinter = isDuplexPrinter;

    }

    public int fillUpToner(int inkLevel) {
        if (tonerLevel <100  && inkLevel >0) {
            int ink = tonerLevel + inkLevel;
            if (ink < 100) {
                tonerLevel = ink;
            } else {
                System.out.println("Ink level cannot be greater than 100%");
            }
        }
        return tonerLevel;
    }

    public int printPages(int amountOfPages, boolean DuplexPrinter) {
        if (DuplexPrinter == true) {
            numberOfPages += (2 * amountOfPages);
            System.out.println("Printing in duplex mode" + numberOfPages + "Pages");
        } else {
            numberOfPages += amountOfPages;
            System.out.println("Printing " + amountOfPages + "Pages");
        }
        return numberOfPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
