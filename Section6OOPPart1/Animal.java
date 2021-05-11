package Section6OOPPart1;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;
//    private String test;

    public Animal(String name,int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal.eat() was called");

    }

    public void move(int speed) {

    }

    public int azul(int prueba) {
        System.out.println("Llamando");

        return prueba;
    }


    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
