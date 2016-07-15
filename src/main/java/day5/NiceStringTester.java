package day5;

import day5.validations.StringValidation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by paulograbin on 13/07/16.
 */
public class NiceStringTester {

    ArrayList<StringValidation> tests;
    ArrayList<Boolean> results;

    HashMap<StringValidation, Boolean> tests2;

    public NiceStringTester() {
        this.tests = new ArrayList<StringValidation>();
        this.results = new ArrayList<Boolean>();

        this.tests2 = new HashMap<StringValidation, Boolean>();
    }


    public boolean performTests(final String testedString) {

        for(int i = 0; i < tests.size(); i++) {
            StringValidation test = tests.get(i);
            Boolean expectedResult = results.get(i);

            System.out.println("Executing " + test.getClass().getSimpleName() + " with expected result " + expectedResult);

            if(test.execute(testedString) == expectedResult) {
                continue;
            }
            else {
                return false;
            }
        }

        System.out.println();

//        tests.stream().forEach(t ->{
//            System.out.println(t.getClass().getSimpleName());
//            t.execute(testedString);
//        });
//
//
//        Iterator<Map.Entry<StringValidation, Boolean>> i = tests2.entrySet().iterator();
//
//        while(i.hasNext()) {
//            i.next().getKey().execute()
//        }
//
//
//
//
//        for(int i = 0; i < tests.size(); i++) {
//            StringValidation test = tests2.entrySet().iterator().next().getKey().execute()
//        }
//
//                .forEach( {
//                t -> t.getKey().execute(testedString)
//        });
//
//        return false;

        return true;
    }

    public void addTest(StringValidation newTest, boolean expectedResult) {
        tests.add(newTest);
        results.add(expectedResult);

        tests2.put(newTest, expectedResult);
    }

    public int getTestCount() {
        return tests.size();
    }

}