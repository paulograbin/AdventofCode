package day5;

import day5.validations.StringValidation;

/**
 * Created by paulograbin on 14/07/16.
 */
class MockAlwaysFalse implements StringValidation {

    @Override
    public boolean execute(String stringUnderTest) {
        return false;
    }
}
