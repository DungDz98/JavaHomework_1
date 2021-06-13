package com.manage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = {};

        do {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Find");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = Manager.create(arr);
                    break;
                case 2:
                    arr = Manager.edit(arr);
                    break;
                case 3:
                    arr = Manager.delete(arr);
                    break;
                case 4:
                    System.out.println(Manager.find(arr));
                    break;
                case 5:
                    for (Student s: arr) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
