package com.deven;

public class Q5 {
    public static void main(String[] args) {
        String text = "Hello World! 123";

        int vowels = 0, consonants = 0, special = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            } else if (!Character.isDigit(ch) && ch != ' ') {
                special++;
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(special);
    }
}