import checkServisUtil.AddAnswerService;
import checkServisUtil.CheckAnswerService;
import checkServisUtil.PrintTrueAnswerService;
import checkServisUtil.ShowMenuService;

import java.io.*;
import java.util.ArrayList;

public class CheckAnswerApp {
    public static void main(String[] args) throws IOException {

        String fileName = "lib/TrueAnswer.txt";

        ShowMenuService menuUtil = new ShowMenuService();
        AddAnswerService addAnswerService = new AddAnswerService();
        PrintTrueAnswerService printTrueAnswerService = new PrintTrueAnswerService();
        CheckAnswerService checkAnswer = new CheckAnswerService();

        int[] menuArr = menuUtil.showMenu();
        int firstNumber = menuArr[0];
        int length = menuArr[1];


        // Adding answers
        ArrayList<String> answer = addAnswerService.AddAnswer(firstNumber, length);


        // Reading from file
        ArrayList<String> arr = printTrueAnswerService.printAnswers(fileName);

        System.out.println();
        System.out.println("RESULT:");


        // Checking exam
        checkAnswer.checkAnswer(length, answer, arr);
    }
}

