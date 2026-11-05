package module04.problem02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String inputName = scanner.nextLine();

        System.out.print("Ras: ");
        String inputBreed = scanner.nextLine();

        Pet pet = new Pet(inputBreed, inputName);
        pet.display();
        scanner.close();
    }
}
