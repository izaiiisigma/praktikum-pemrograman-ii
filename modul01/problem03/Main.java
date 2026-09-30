package modul01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int startingNum = input.nextInt();

        do {
            if (startingNum % 2 == 0) {
                startingNum++;
            }

            System.out.print(startingNum);

            if (n > 1) {
                System.out.print(", ");
            }
            startingNum += 2;
            n--;
        } while (n > 0);

        input.close();
    }
}