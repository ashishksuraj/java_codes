/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffl;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class FFL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = 0, b = 0, min1 = 100, min2 = 100;
            int flag1 = 0, flag2 = 0;
            int s = scan.nextInt();
            int[] p = new int[n];
            int[] df = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                df[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (df[i] == 0) {
                    a++;
                    if (min1 > p[i]) {
                        min1 = p[i];
                        flag1 = i;
                    }
                } else {
                    b++;
                    if (min2 > p[i]) {
                        min2 = p[i];
                        flag2 = i;
                    }
                }
            }
            /*System.out.println("a is " + a + " at i " + flag1 + " b is " + b + " at i " + flag2);
            System.out.println(min1 + " " + min2);*/
            if (a == n || b == n) {
                System.out.println("no");
            } else {
                if ((s + min1 + min2) > 100) {
                    System.out.println("no");
                } else {
                    System.out.println("yes");
                }
            }
        }
    }

}
