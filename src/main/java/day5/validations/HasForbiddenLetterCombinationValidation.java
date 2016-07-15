package day5.validations;

/**
 * Created by paulograbin on 13/07/16.
 */
public class HasForbiddenLetterCombinationValidation implements StringValidation {

    String stringUnderTest = "";

    public boolean execute(String stringUnderTest) {
        this.stringUnderTest = stringUnderTest;

        if (containsAB() || containsCD() || containsPQ() || containsXY()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean containsXY() {
        return stringUnderTest.contains("xy");
    }

    private boolean containsPQ() {
        return stringUnderTest.contains("pq");
    }

    private boolean containsCD() {
        return stringUnderTest.contains("cd");
    }

    private boolean containsAB() {
        return stringUnderTest.contains("ab");
    }
}
