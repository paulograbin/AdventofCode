package day5.secondHalf;

/**
 * Created by I841059 on 25/04/2016.
 */
public class NiceString {

    String mString;

    public NiceString(String s) {
        this.mString = s;
    }


    public boolean isNice() {
        System.out.println("Checking " + mString + " ") ;

        if(containsAtLeastOneLetterThatRepearsWithOneInBetween() && twoLettersTwiceNotOverlapping()) {
            return true;
        }

        return false;
    }

    public boolean twoLettersTwiceNotOverlapping() {
        String sub = "";

        for(int i = 0; i < mString.length()-1; i++) {
            sub = mString.substring(i, i+2);

            if (checkFor(sub, mString.substring(i+2))) {
                return true;
            }
        }

        return false;
    }

    private boolean checkFor(String sub, String substring) {
        if(substring.contains(sub)) {
            return true;
        }

        return false;
    }

    public boolean containsAtLeastOneLetterThatRepearsWithOneInBetween() {
        char currentChar;
        char targetChar;

        for(int i = 0; i < mString.length() -2; i++) {
            currentChar = mString.charAt(i);
            targetChar = mString.charAt(i+2);

            if(currentChar == targetChar)
                return true;
        }

        return false;
    }
}