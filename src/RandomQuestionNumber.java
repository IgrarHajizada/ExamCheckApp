import java.util.Random;
import java.util.Scanner;

public class RandomQuestionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Length: ");
        int length = scanner.nextInt();


        for (int i = 1; i <= length; i++) {
            System.out.println(i + ") " + random.nextInt(1, 300));
        }
    }
}
