package Section7OOPPart2.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {
   public Jaws() {
       super("Jaws");
   }

   public String plot(String name) {
       return "A shark eats a lot of people";
   }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndpendenceDay");
    }

    @Override
    public String plot() {
        return "Alien Atempt";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Running inside a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}



public class Polymorfhism1 {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + movie.getName() + "\n" +
                   "" );
        }

    }

        public static Movie randomMovie () {
            int randomNumber = (int) (Math.random() * 5) + 1;
            System.out.println("Random number generated was: " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new MazeRunner();
                case 4:
                    return new StarWars();
                case 5:
                    return new Forgetable();
            }
            return null;
        }

    }

