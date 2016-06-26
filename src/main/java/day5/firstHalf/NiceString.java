package day5.firstHalf;

/**
 * Created by I841059 on 25/04/2016.
 */
public class NiceString {

    String s;

    public NiceString(String s) {
        this.s = s;
    }


    public boolean isNice() {
        System.out.print(s + " ") ;

        if (containsForbiddenLetters()) {
            System.out.println("contains forbidden combinations...");
            return false;
        }

        if(containsAtLeastThreeVows() && containsTwoLetterInARow()) {
            System.out.println("is nice!!!");
            return true;
        }

        System.out.println("isn't nice!");
        return false;
    }

    public boolean containsForbiddenLetters() {
        if (containsAB() || containsCD() || containsPQ() || containsXY()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean containsXY() {
        return s.contains("xy");
    }

    private boolean containsPQ() {
        return s.contains("pq");
    }

    private boolean containsCD() {
        return s.contains("cd");
    }

    private boolean containsAB() {
        return s.contains("ab");
    }

    public boolean containsTwoLetterInARow() {
        char currentLetter;

        for (int i = 0; i < s.length() - 1; i++) {
            currentLetter = s.charAt(i);
//            System.out.println("Comparando " + currentLetter + " com " + s.charAt(i + 1));
            if (currentLetter == s.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsAtLeastThreeVows() {
        int vows = 0;
        boolean value = false;

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);

            if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
                vows = vows + 1;
            }
        }

        if (vows >= 3) {
            value = true;
        }

        return value;
    }
}