package day1;


import sun.misc.Queue;

import java.util.LinkedList;

public class InputStringQueue extends LinkedList<Character> {

    public InputStringQueue(String inputString) {
        super();

        for(int i = 0; i < inputString.length(); i++) {
            this.add(inputString.charAt(i));
        }
    }
}
