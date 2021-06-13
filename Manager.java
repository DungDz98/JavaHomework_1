package com.manage;

import java.util.Scanner;

public class Manager {
    public static Student[] create(Student arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your Gender: ");
        String gender = sc.nextLine();

        Student student = new Student(id, name, gender, age);
        Student[] arrNew = new Student[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = student;
        return arrNew;
    }

    public static Student[] delete(Student arr[]) {
        System.out.println("Enter ID: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt() - 1;
        Student[] arrNew = new Student[arr.length - 1];

        for (int i = id; i < arrNew.length; i++ ) {
            arr[i] = arr[i + 1];
        }
        for (int j = 0; j < arrNew.length; j++) {
            arrNew[j] = arr[j];
        }
        return arrNew;
    }

    public static Student[] edit(Student arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        System.out.print("Enter your Id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your Gender: ");
        String gender = sc.nextLine();

        Student student = new Student(id, name, gender, age);
        arr[index] = student;
        return arr;

    }

    public static Student find(Student arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;
        return arr[index];
        }
    }


