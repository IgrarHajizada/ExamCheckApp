package checkServisUtil;

import java.util.Scanner;

public class ShowMenuService {

    public int[] showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which question will you start with?: ");
        int firstNumber = sc.nextInt();
        System.out.print("Which question will you study?: ");
        int length = sc.nextInt();

        int[] arr = {firstNumber, length};
        return arr;
    }
}
