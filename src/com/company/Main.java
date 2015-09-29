package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        Random rn = new Random();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rn.nextInt(9);
            }

        }
        printInConcole(arr1);
        saveToFile(arr1);
    }


    static void saveToFile(int[][] array) {
        try (PrintWriter pw = new PrintWriter("array.txt")) {
            for (int[] i : array) {
                for (int j : i) {
                    pw.print(j + " ");
                }
                pw.println();
            }
            System.out.println("Array saved to array.txt");

        } catch (IOException e) {
            System.out.println("error");
        }

    }


    static void printInConcole(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
