package day5.validations;

/**
 * Created by paulograbin on 13/07/16.
 */
public class HasAtLeastThreeVowsValidation implements StringValidation {

    public boolean execute(String stringUnderTest) {

        int vows = 0;
        boolean value = false;

        for (int i = 0; i < stringUnderTest.length(); i++) {
            String a = stringUnderTest.substring(i, i + 1);

            if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
                vows = vows + 1;
            }

            if (vows >= 3) {
                value = true;
            }
        }

        return value;
    }
}
