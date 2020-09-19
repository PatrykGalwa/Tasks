package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordBuilder {

    public final static String FALSE_VALUE = "FALSE";
    public final static String TRUE_VALUE = "TRUE";

    public String checkValue(char[][] chars, String word) {
        String returnValue = TRUE_VALUE;
        if (word == null || word.equals("")) {
            returnValue = FALSE_VALUE;
        } else {
            HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
            for (char[] arrayCharacters : chars) {
                for (char singleChar : arrayCharacters) {
                    Integer count = characterIntegerHashMap.getOrDefault(singleChar, 0);
                    characterIntegerHashMap.put(singleChar, ++count);
                }
            }
            for (char wordCharacter : word.toCharArray()) {
                Integer count = characterIntegerHashMap.get(wordCharacter);
                if (count == null || count == 0) {
                    returnValue = FALSE_VALUE;
                    break;
                } else {
                    characterIntegerHashMap.put(wordCharacter, --count);
                }
            }
        }
        return returnValue;
    }
}
