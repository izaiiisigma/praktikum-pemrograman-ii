package module04.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = scanner.nextLine();
        System.out.print("Ras: ");
        String breed = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();

            Cat cat = new Cat(breed, name, furColor);
            cat.displayCatDetails();
        } else if (choice == 2) {
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();
            System.out.print("Kemampuan : ");
            String[] abilities = scanner.nextLine().split(",");

            Dog dog = new Dog(name, breed, furColor, abilities);
            dog.displayDogDetails();
        }

        scanner.close();
    }
}
