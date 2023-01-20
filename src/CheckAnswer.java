import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckAnswer {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\HP\\Desktop\\TrueAnswer.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print("First question number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Last question number: ");
        int length = sc.nextInt();
        ArrayList<String> answer = new ArrayList<>();



        // Adding answers
        if (firstNumber == 1) {
            for (int i = 1; i <= length; i++) {
                System.out.print(i + ") ");
                answer.add(sc.next());
            }
        } else {
            for (int i = 1; i <= firstNumber-1; i++) {
                System.out.println(i + ") ");
                answer.add("-");
            }
            for (int i = firstNumber; i <= length; i++) {
                System.out.print(i + ") ");
                answer.add(sc.next());
            }
        }
        System.out.println("\n1: " + answer);




        // Reading from file
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                arr.add(line);
            }
            System.out.println("2: " + arr + "\n");
        }

        System.out.println();
        System.out.println("RESULT:");




        // Checking exam
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

