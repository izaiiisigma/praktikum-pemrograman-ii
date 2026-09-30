package module01.problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] abuHand = new char[3];
        char[] bagasHand = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abuHand[i] = input.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagasHand[i] = input.next().charAt(0);
        }

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < 3; i++) {
            char a = abuHand[i];
            char b = bagasHand[i];

            if (a != b) {
                if ((a == 'B' && b == 'G') || (a == 'G' && b == 'K') || (a == 'K' && b == 'B')) {
                    abuScore++;
                }
                else {
                    bagasScore++;
                }
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}