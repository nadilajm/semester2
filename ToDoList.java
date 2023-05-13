import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        String choice = "";

        while (!choice.equals("3")) {

            System.out.println("\n==== To-Do List ====");

            System.out.println("1. Tambah tugas");

            System.out.println("2. Lihat daftar tugas");

            System.out.println("3. Keluar");

            System.out.print("Pilihan anda: ");

            choice = input.nextLine();

            if (choice.equals("1")) {

                System.out.print("Masukkan tugas baru: ");

                String newTask = input.nextLine();

                tasks.add(newTask);

                System.out.println("Tugas berhasil ditambahkan!");

            } else if (choice.equals("2")) {

                System.out.println("\n==== Daftar Tugas ====");

                int taskNumber = 1;

                for (String task : tasks) {

                    System.out.println(taskNumber + ". " + task);

                    taskNumber++;

                }

            } else if (choice.equals("3")) {

                System.out.println("Terima kasih!");

                break;

            } else {

                System.out.println("Pilihan tidak valid, coba lagi.");

            }

        }

    }

}
