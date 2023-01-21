package checkServisUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAnswerService {

    public ArrayList<String> AddAnswer(int firstNumber, int length) {
        ArrayList<String> answer = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        if (firstNumber == 1) {
            for (int i = 1; i <= length; i++) {
                System.out.print(i + ") ");
                answer.add(sc.next());
            }
        } else {
            for (int i = 1; i <= firstNumber - 1; i++) {
                System.out.println(i + ") ");
                answer.add("-");
            }
            for (int i = firstNumber; i <= length; i++) {
                System.out.print(i + ") ");
                answer.add(sc.next());
            }
        }
        System.out.println("\n1: " + answer);
        return answer;
    }
}
