package Section7OOPPart2;

public class Bedroom {
    private String name;
//    private Wall wall;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed numb;
    private Lamp lamp;
    private Ceiling ceiling;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed numb, Lamp lamp, Ceiling ceiling) {
        this.name = name;
//        this.wall = wall;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.numb = numb;
        this.lamp = lamp;
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
    }



    



}
