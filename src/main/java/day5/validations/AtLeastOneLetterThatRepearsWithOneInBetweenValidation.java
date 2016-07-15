package day5.validations;

/**
 * Created by paulograbin on 14/07/16.
 */
public class AtLeastOneLetterThatRepearsWithOneInBetweenValidation implements StringValidation {

    @Override
    public boolean execute(String stringUnderTest) {
        char currentChar;
        char targetChar;

        for(int i = 0; i < stringUnderTest.length() -2; i++) {
            currentChar = stringUnderTest.charAt(i);
            targetChar = stringUnderTest.charAt(i+2);

            if(currentChar == targetChar)
                return true;
        }

        return false;
    }

}
