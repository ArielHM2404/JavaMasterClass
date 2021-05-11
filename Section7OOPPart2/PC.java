package Section7OOPPart2;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerbtn();
        drawLogo();
    }

    private  void drawLogo() {
        monitor.drawPixelAt(1200, 150, "Sega!!!");
    }


}
