package Section4;



public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            kilometersPerHour /= 1.609;
        } else {
            kilometersPerHour = -1;
        }

        return Math.round(kilometersPerHour);
    }

    public static void printConversion (double kilometersPerHour) {
        long toMilesPerHour = SpeedConverter.toMilesPerHour(kilometersPerHour);

        if (toMilesPerHour >= 0) {
            System.out.println(kilometersPerHour +
                    " km/h = " + toMilesPerHour +
                    " mi/h");
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
