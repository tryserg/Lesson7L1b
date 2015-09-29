package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        try (PrintWriter pw = new PrintWriter("a.txt")) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("arr1 element #" + i);
                arr1[i] = sc.nextInt();

                System.out.println("arr2 element #" + i);
                arr2[i] = sc.nextInt();
                
                pw.println(arr1.toString());
                pw.println(arr2.toString());

            }

        } catch (IOException e) {
            System.out.println("ERROR");
        }


        // write your code here
    }
}
