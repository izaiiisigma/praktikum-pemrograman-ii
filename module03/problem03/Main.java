package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String id = input.nextLine();

                    boolean doesIdAlreadyExist = false;
                    for (Student student : students) {
                        if (student.getId().equals(id)) {
                            doesIdAlreadyExist = true;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("NIM " + id + " sudah terdaftar. Mahasiswa tidak ditambahkan.");
                    } else {
                        students.add(new Student(name, id));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }

                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToDelete = input.nextLine();

                    boolean isIdFound = false;
                    for (Student student : students) {
                        if (student.getId().equals(idToDelete)) {
                            isIdFound = true;
                            students.remove(student);
                            System.out.println("Mahasiswa dengan NIM " + idToDelete + " dihapus.");
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " tidak ditemukan.");
                    }

                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String idToSearch = input.nextLine();

                    boolean isIdFoundInSearch = false;
                    for (Student student : students) {
                        if (student.getId().equals(idToSearch)) {
                            isIdFoundInSearch = true;
                            System.out.println("NIM: " + student.getId() + ", Nama: " + student.getName());
                            break;
                        }
                    }

                    if (!isIdFoundInSearch) {
                        System.out.println("Mahasiswa dengan NIM " + idToSearch + " tidak ditemukan.");
                    }

                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student student : students) {
                        System.out.println("NIM: " + student.getId() + ", Nama: " + student.getName());
                    }

                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");

                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}