package day4;

public class Resolver {

    private MD5Calculator md5 = new MD5Calculator();

    public int getIntToFiveZeroes(String privateKey) {
        int i = 0;

        while(!startsWithFiveZeroes(md5.calculateMD5(privateKey+i))) {
            i++;
        }

        return i;
    }

    public int getIntToSixZeroes(String privateKey) {
        int i = 0;

        while(!startsWithSixZeroes(md5.calculateMD5(privateKey+i))) {
            i++;
        }

        return i;
    }

    private boolean startsWithFiveZeroes(String hash) {
        return hash.startsWith("00000");
    }

    private boolean startsWithSixZeroes(String hash) {
        return hash.startsWith("000000");
    }

    public void printResults() {
        final String PRIVATE_KEY = "ckczppom";

        System.out.println("Five zeroes " + getIntToFiveZeroes(PRIVATE_KEY));
        System.out.println("Six zeroes " + getIntToSixZeroes(PRIVATE_KEY));
        System.out.println();
    }

    public static void main(String[] args) {
        Resolver resolver = new Resolver();
        resolver.printResults();
    }
}
