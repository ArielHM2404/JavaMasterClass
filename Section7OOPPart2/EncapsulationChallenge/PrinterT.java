package Section7OOPPart2.EncapsulationChallenge;

public class PrinterT {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public PrinterT(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount >0 && tonerAmount <=100) {
            if(this.tonerLevel + tonerAmount >100) {
                return  -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }

    }
}
