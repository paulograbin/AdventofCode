package day1.firstHalf;


import day1.InputStringQueue;

public class FloorCounter {

    InputStringQueue stack;

    public FloorCounter(String input) {
        stack = new InputStringQueue(input);
    }

    public int count() {
        int count = 0;

        while(!stack.isEmpty()) {
            if(stack.pop() == '(')
                count++;
            else
                count--;
        }

        return count;
    }
}
