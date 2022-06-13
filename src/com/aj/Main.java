package com.aj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int diskNumbers = input.nextInt();

        hanoiTower(diskNumbers, "Start", "Temp", "Destination");
    }

    // T(n)= 2^n-1
    private static void hanoiTower(int diskNumber, String start, String temp, String end) {
        if (diskNumber == 1)
            System.out.println(start + " -> " + end);
        else {
            hanoiTower(diskNumber - 1, start, end, temp);
            System.out.println(start + " -> " + end);

            hanoiTower(diskNumber - 1, temp, start, end);
        }
    }
}
