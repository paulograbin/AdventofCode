package day1.secondHalf;


import day1.InputStringQueue;

public class BasementFinder {

    InputStringQueue queue;

    public BasementFinder(String input) {
        queue = new InputStringQueue(input);
    }

    public int getPositionInWhichSantaEntersInTheBasement() {
        int currentFloor = 0;
        int position = 0;

        while(currentFloor != -1) {
            char poped = queue.pop();

            if(poped == '(')
                currentFloor++;
            else
                currentFloor--;

            position++;
        }

        return position;
    }

}
