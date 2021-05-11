package Section5ControlFlowStatements;

public class DigitSum {
    public static void main(String[] args) {
        sumDigits(15);

    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            //Extract the least significant
            int digit = number % 10;
            sum += digit;
            number/=10;
        }
        return sum;
    }
}
