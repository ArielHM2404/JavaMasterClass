package Section7OOPPart2;

public class Room {
    public TV tv;
    public Table table;
    public Sofa sofa;

    public Room(TV tv, Table table, Sofa sofa) {
        this.tv = tv;
        this.table = table;
        this.sofa = sofa;
    }

    public void TurnTV() {
        tv.turnTVOn(true);
        tv.changeChannel(5);
        tv.changeVolume(15);
    }

    public void useTable() {
        table.amountOfChairs(7);
        table.AmountOfLegs(5);
    }
}
