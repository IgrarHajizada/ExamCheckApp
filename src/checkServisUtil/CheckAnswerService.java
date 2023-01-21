package checkServisUtil;

import java.util.ArrayList;

public class CheckAnswerService {

    public void checkAnswer(int length, ArrayList<String> answer, ArrayList<String> arr) {
        int number = 1;
        for (int i = 0; i < length; i++) {
            boolean b = answer.get(i).equals(arr.get(i).toLowerCase());

            if (b) {
                System.out.println(number + ") " + true + " +");

            } else {
                System.out.println(number + ") " + false + " Y.A-" + answer.get(i) + "  T.A-" + arr.get(i));
            }
            number++;
        }
    }
}
