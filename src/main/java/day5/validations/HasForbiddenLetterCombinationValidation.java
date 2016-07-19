package day5.validations;

/**
 * Created by paulograbin on 13/07/16.
 */
public class HasForbiddenLetterCombinationValidation implements StringValidation {

    private String stringUnderTest = "";

    public boolean execute(String stringUnderTest) {
        this.stringUnderTest = stringUnderTest;

        return containsAB() || containsCD() || containsPQ() || containsXY();
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
