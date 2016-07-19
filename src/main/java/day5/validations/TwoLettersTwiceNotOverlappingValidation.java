package day5.validations;

public class TwoLettersTwiceNotOverlappingValidation implements StringValidation {

    @Override
    public boolean execute(String stringUnderTest) {
        String sub;

        for (int i = 0; i < stringUnderTest.length() - 1; i++) {
            sub = stringUnderTest.substring(i, i + 2);

            if (checkFor(sub, stringUnderTest.substring(i + 2))) {
                return true;
            }
        }

        return false;
    }

    private boolean checkFor(String sub, String substring) {
        return substring.contains(sub);
    }
}