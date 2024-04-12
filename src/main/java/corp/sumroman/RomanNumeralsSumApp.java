package corp.sumroman;

import java.util.Scanner;
import java.util.Arrays;


public class RomanNumeralsSumApp {
    public static void main(String[] args) {
        System.out.println("Please enter two Roman numerals for summing in the following format: II+XVI or II + XVI");
        System.out.println("The program calculates only the SUM of TWO Roman numerals in the range from 0 to 4000");
        Scanner scanner = new Scanner(System.in);

        System.out.println(new RomanNumeralsSumApp().sum(scanner.nextLine()));
    }

    public String sum(String expression) {
        RomanNumeralsMethods methods = new RomanNumeralsMethods();

        StringBuilder cleanExpression = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }

            cleanExpression.append(c);
        }
        expression = cleanExpression.toString();

        int result = Arrays
                .stream(expression.split("\\+"))
                .mapToInt(methods::romeToArabic)
                .sum();

        return methods.arabicToRome(result);
    }


}
