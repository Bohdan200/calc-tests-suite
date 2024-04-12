package corp.factorial;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        System.out.println("Please enter a number to calculate factorial");
        Scanner scanner = new Scanner(System.in);

        System.out.println(new FactorialApp().calc(scanner.nextInt()));
    }

    long calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input should be >= 0");
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;

            if (result < 0) {
                throw new IllegalArgumentException("Input " + number + " too big");
            }
        }

        return result;
    }
}
