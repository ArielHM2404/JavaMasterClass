package Section7OOPPart2;

public class Motherboard {
    private String model;
    private String manufacter;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacter, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufacter = manufacter;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + "is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
