public class RomanNumerals {
    private static int[] arabNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] romLet = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    /**
     * Converts a number to roman
     * @param arabic Then number you want to convert
     * @return the number in roman
     */
    public static String arabicToRoman(int arabic) {
        String roman = "";

        for (int i = 0; i < arabNum.length; i++) {
            while (arabic >= arabNum[i]) {
                roman += romLet[i];
                arabic -= arabNum[i];
            }
        }
        return roman;
    }

    /**
     * Converts Roman Numerals to Arabic Number
     * @param roman the Roman Numerals you want to convert to Arabic Number
     * @return the conveted Arabic Number
     */
    public static int romanToArabic(String roman) {
        int i = 0;
        int arabic = 0;

        while (i < roman.length()) {
            char numeral = roman.charAt(i);
            int letter = romanToArabic(numeral);
            i++;

            if (i == roman.length()) {
                arabic += letter;
            } else {
                int nextLetter = romanToArabic(roman.charAt(i));
                if (nextLetter > letter) {
                    arabic += (nextLetter - letter);
                    i++;
                } else {
                    arabic += letter;
                }
            }
        }
        return arabic;
    }
    /**
     * Converts Roman Numerals to Arabic Number
     * @param numeral the Roman Numerals you want to convert to Arabic Number
     * @return the conveted Arabic Number
     */
    private static int romanToArabic(char numeral) {
        switch (numeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
