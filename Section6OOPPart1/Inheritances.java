package Section6OOPPart1;

public class Inheritances {

    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1, 1, 5, 5);
        Animal animalq = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 1, 29, "Long coat");
        dog.eat();
//        dog.walk();
//        dog.run();
    }

    private  void rest() {

    }
    private void moveMuscals() {

    }
    private void moveBackFin() {

    }
    private void swim(int speed) {
        moveMuscals();
        moveBackFin();
//        super()
    }


}
