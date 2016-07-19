package day5.validations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by paulograbin on 13/07/16.
 */
public class HasAtLeastThreeVowsValidation implements StringValidation {

    public boolean execute(String stringUnderTest) {

        List<Character> vv = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int vowCount = 0;
        boolean value = false;

        for (int i = 0; i < stringUnderTest.length(); i++) {
            char currentChar = stringUnderTest.charAt(i);

            if (vv.contains(currentChar))
               vowCount = vowCount + 1;

            if (vowCount >= 3) {
                value = true;
            }
        }

        return value;
    }
}
