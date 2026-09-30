package module01.problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startingNum = input.nextInt();

        int i = 1;
        while (i <= 11) {
            if (startingNum % 5 == 0) {
                System.out.print((startingNum / 5) - 1);
            } else {
                System.out.print(startingNum);
            }

            if (i < 11) {
                System.out.print(",");
            }
            startingNum++;
            i++;
        }

        input.close();
    }
}