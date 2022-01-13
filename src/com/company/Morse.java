package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Morse {

    private static final Map<Character, String> alphabet = new HashMap<>() {{
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
        put(' ', "");
    }};

    public static String getConvertedText(String text) throws IOException
    {
        String textToConvert = (text.contains(".txt")) ? readTextFromFile(text) : text;

        char[] letters = textToConvert.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < letters.length; i++)
        {
            String letterInMorse = alphabet.get(letters[i]);
            result.append(letterInMorse);
            if(i + 1 != letters.length) result.append("|");
        }

        return result.toString();
    }

    // Spatne jsem nejspis pochopil pri hodine zadani, myslel jsem, ze mame prevadet text ze souboru
    // Je treba zadat uplnou cestu k souboru
    private static String readTextFromFile(String fileName) throws IOException
    {
        File file = new File(fileName);
        Scanner scanner1 = new Scanner(new FileReader(file));

        StringBuilder result = new StringBuilder();

        while(scanner1.hasNextLine()) {
            result.append(scanner1.nextLine());
            result.append(" ");
        }

        scanner1.close();

        return result.toString();
    }
}
