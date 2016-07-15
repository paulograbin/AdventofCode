package day5.validations;

/**
 * Created by paulograbin on 13/07/16.
 */
public class HasTwoLettersInARowValidation implements StringValidation {

    public boolean execute(String stringUnderTest) {
        char currentLetter;

        for (int i = 0; i < stringUnderTest.length() - 1; i++) {
            currentLetter = stringUnderTest.charAt(i);
//            System.out.println("Comparando " + currentLetter + " com " + s.charAt(i + 1));
            if (currentLetter == stringUnderTest.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }
}
