package Section4;

public class SecondsAndMinutes {

    public static String getDurationString (int minutes, int seconds) {

        String finalValue;
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours;
            int remainingMint;
            hours = minutes / 60;
            remainingMint = minutes % 60;
//            finalValue = "The amount of hours in " + minutes +" "+ seconds +
//                    " are" + hours;
            finalValue = hours + " h " +remainingMint+ " m " +seconds+ " s";
        } else {
            finalValue = " Invalid Value";
        }

        return finalValue;

    }
}
