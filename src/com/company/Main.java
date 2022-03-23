package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int so = scanner.nextInt();
        System.out.println(  so +" số nguyên tố đầu tiên là");
        int count = 0;
        for (int i = 2; count < so; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count ++;
            }
            }
        }

    public static boolean isPrimeNumber(int so) {
        if (so < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(so);
        for (int i = 2; i <= squareRoot; i++) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }
}
