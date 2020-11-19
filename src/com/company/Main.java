package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getNumber(" Введите номер палиндрома: ");
        printResult(findPalindrome(n));
    }

    public static int findPalindrome(int n) {
        int count = 0;
        int result = -1;
        for (int i = 0; count < n; i++) {
            if (isPolindrom(i)) {
                result = i;
                count++;
            }
        }
        return result;
    }

    public static int findSymbolOnPositionInNumber(int num, int pos) {
        return (int) (num / Math.pow(10, getCapacity(num) - pos) % 10);
    }

    public static boolean isPolindrom(int num) {
        int digitCapacity = getCapacity(num);
        for (int i = 0; i < digitCapacity / 2; i++) {
            if (findSymbolOnPositionInNumber(num, i + 1) != findSymbolOnPositionInNumber(num, digitCapacity - i)) {
                return false;
            }
        }
        return true;
    }

    public static int getCapacity(int num) {
        return (int) Math.log10(num) + 1;
    }

    public static int getNumber(String str) {
        System.out.println(str);
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    public static void printResult(int result) {
        System.out.println("Номер палиндрома: " + result);
    }
}


