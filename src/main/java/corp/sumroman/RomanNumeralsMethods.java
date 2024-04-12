package corp.sumroman;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralsMethods {
    public int romeToArabic(String rome) {
        int result = 0;

        Map<Character, Integer> romeArabicValues = new HashMap<>();
        romeArabicValues.put('I', 1);
        romeArabicValues.put('V', 5);
        romeArabicValues.put('X', 10);
        romeArabicValues.put('L', 50);
        romeArabicValues.put('C', 100);
        romeArabicValues.put('D', 500);
        romeArabicValues.put('M', 1000);

        char[] romeDigits = rome.toCharArray();

        for(int i = 0; i < romeDigits.length; i++) {
            char currentDigit = romeDigits[i];
            int currentArabicValue = romeArabicValues.get(currentDigit);

            if (i == romeDigits.length - 1) {
                result += currentArabicValue;
            }
            else {
                char nextDigit = romeDigits[i + 1];
                int nextArabicValue = romeArabicValues.get(nextDigit);

                if (nextArabicValue > currentArabicValue) {
                    result += nextArabicValue - currentArabicValue;
                } else {
                    result += nextArabicValue + currentArabicValue;
                }

                i++;
            }
        }

        return result;
    }

    public String arabicToRome(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumerals> romanNumerals = RomanNumerals.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumerals currentSymbol = romanNumerals.get(i);

            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());

                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
