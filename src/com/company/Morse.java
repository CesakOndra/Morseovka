package com.company;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Morse {

    private static final Map<Character, String> alphabet = new HashMap<Character, String>() {{
        put('A', ".-");
        put('a', ".-");
        put('B', "-...");
        put('b', "-...");
        put('C', "-.-.");
        put('c', "-.-.");
        put('D', "-..");
        put('d', "-..");
        put('E', ".");
        put('e', ".");
        put('F', "..-.");
        put('f', "..-.");
        put('G', "--.");
        put('g', "--.");
        put('H', "....");
        put('h', "....");
        put('I', "..");
        put('i', "..");
        put('J', ".---");
        put('j', ".---");
        put('K', "-.-");
        put('k', "-.-");
        put('L', ".-..");
        put('l', ".-..");
        put('M', "--");
        put('m', "--");
        put('N', "-.");
        put('n', "-.");
        put('O', "---");
        put('o', "---");
        put('P', ".--.");
        put('p', ".--.");
        put('Q', "--.-");
        put('q', "--.-");
        put('R', ".-.");
        put('r', ".-.");
        put('S', "...");
        put('s', "...");
        put('T', "-");
        put('t', "-");
        put('U', "..-");
        put('u', "..-");
        put('V', "...-");
        put('v', "...-");
        put('W', ".--");
        put('w', ".--");
        put('X', "-..-");
        put('x', "-..-");
        put('Y', "-.--");
        put('y', "-.--");
        put('Z', "--..");
        put('z', "--..");
        put(' ', " ");
    }};

    public static String getConvertedText(String fileName)
    {
        String textToConvert = readTextFromFile(fileName);

        char[] letters = textToConvert.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char letter : letters)
        {
            String letterInMorse = alphabet.get(letter);
            result.append(letterInMorse);
        }

        return result.toString();
    }

    private static String readTextFromFile(String fileName)
    {
        InputStream stream = Morse.class.getClassLoader().getResourceAsStream(fileName + ".txt");
        Scanner scanner = new Scanner(Objects.requireNonNull(stream));

        StringBuilder result = new StringBuilder();

        while(scanner.hasNextLine()) {
            result.append(scanner.nextLine());
            result.append(" ");
        }

        scanner.close();

        return result.toString();
    }
}
