package servisUtil;

import java.util.Scanner;

public class ShowMenuService {

    public int[] showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First question number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Last question number: ");
        int length = sc.nextInt();

        int[] arr = {firstNumber, length};
        return arr;
    }
}
