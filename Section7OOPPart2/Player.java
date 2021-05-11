package Section7OOPPart2;

public class Player {
    public String name;
    public int heath;
    public String weapon;

    public void lossHeath(int damage) {
        this.heath -= damage;
        if (this.heath <0) {
            System.out.println("Player knoced out");

        }
    }

    public int healthRemaining() {
        return this.heath;
    }
}
