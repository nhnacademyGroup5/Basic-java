package com.nhnacademy.groupstudy.chapter8.jiwon;

import java.util.Scanner;

public class RomanCheck {
    private String roman;
    private int arabic;

    public RomanCheck(int arabic) {
        if (arabic < 1 || arabic > 3999) {
            throw new NumberFormatException(
                    "Range 1 to 3999");
        }
        this.arabic = arabic;
        this.roman = toRoman(arabic);
    }

    public RomanCheck(String roman) {
        checkRoman(roman);
        this.roman = roman;
        this.arabic = toInt(roman);
    }


    private String toRoman(int number) {
        StringBuilder roman = new StringBuilder();
        int n = number;

        for (RomanNumeral numeral : RomanNumeral.values()) {
            while (n >= numeral.toInt()) {
                roman.append(numeral);
                n -= numeral.toInt();
            }
        }

        return roman.toString();
    }

    private int toInt(String romanNumeral) {
        int result = 0;
        int index = 0;
        while (index < romanNumeral.length()) {
            char currentChar = romanNumeral.charAt(index);
            int currentValue = RomanNumeral.valueOf(String.valueOf(currentChar)).toInt();

            if (index + 1 < romanNumeral.length()) {
                char nextChar = romanNumeral.charAt(index + 1);
                int nextValue = RomanNumeral.valueOf(String.valueOf(nextChar)).toInt();

                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    index += 2; // Skip both characters
                } else {
                    result += currentValue;
                    index++;
                }
            } else {
                result += currentValue;
                index++;
            }
        }
        return result;
    }

    public int getArabic() {
        return arabic;
    }

    public String getRoman() {
        return roman;
    }

    private void checkRoman(String romanNumeral) {
        String regex;
        regex =
                "(M{4,}|D{4,}|C{4,}|L{4,}|X{4,}|V{4,}|I{4,})";
        if (romanNumeral.matches(regex)) {
            throw new IndexOutOfBoundsException("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            if (userInput.matches("[IVXLCDM]+")) {
                RomanCheck roman = new RomanCheck(userInput);
                System.out.println(
                        roman.getRoman() + " = " + roman.getArabic());
            } else if (userInput.matches("\\d+")) {
                int arabic = Integer.parseInt(userInput);
                RomanCheck roman = new RomanCheck(arabic);
                System.out.println(roman.getArabic() + " = " + roman.getRoman());
            } else {
                System.out.println(
                        "Invalid input");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
