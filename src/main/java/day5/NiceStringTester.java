package day5;

import day5.validations.StringValidation;

import java.util.ArrayList;

/**
 * Created by paulograbin on 13/07/16.
 */
public class NiceStringTester {

    private ArrayList<StringValidation> tests;
    private ArrayList<Boolean> results;

    public NiceStringTester() {
        this.tests = new ArrayList<>();
        this.results = new ArrayList<>();
    }


    public boolean performTests(final String testedString) {
        if (tests.size() < 1)
            throw new IllegalArgumentException("Must have at least one test");

        for (int i = 0; i < tests.size(); i++) {
            StringValidation test = tests.get(i);
            Boolean expectedResult = results.get(i);

            if (test.execute(testedString) != expectedResult)
                return false;

        }

        return true;
    }

    public void addTest(StringValidation newTest, boolean expectedResult) {
        tests.add(newTest);
        results.add(expectedResult);
    }

    public int getTestCount() {
        return tests.size();
    }

}