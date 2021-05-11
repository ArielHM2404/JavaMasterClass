import Section4.SpeedConverter;

import static Section4.SecondsAndMinutes.getDurationString;

public class  Testing {

    public static void main(String[] args) {
//        toMilesPerHour(55);
//        printConversion(44);
        getDurationString(5,50);

       long miles = SpeedConverter.toMilesPerHour(0.0);
        System.out.println("Miles = " + miles);
       SpeedConverter.printConversion(0.0);

    }

    public static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour > 0) {
            kilometersPerHour /= 1.609;
        } else {
            kilometersPerHour = -1;
        }
        return (long) kilometersPerHour;
    }

    public static void printConversion (double kilometersPerHour) {
        double kilometersToMiles;
        double toMilesPerHour = toMilesPerHour(kilometersPerHour);
        long roundValue;


        if (toMilesPerHour > 0) {
//            kilometersToMiles = toMilesPerHour / 1.609;
            roundValue = Math.round(toMilesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + roundValue + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

//        if (kilometersPerHour > 0) {
//            kilometersToMiles = kilometersPerHour / 1.609;
//            roundValue = Math.round(kilometersToMiles);
//            System.out.println(kilometersPerHour + " km/h = " + roundValue + " mi/h");
//        } else {
//            System.out.println("Invalid Value");
//        }
    }

}
