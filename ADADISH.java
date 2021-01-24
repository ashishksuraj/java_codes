/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adadish;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class ADADISH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            switch (n) {
                case 1:
                    System.out.println(a[0]);
                    break;
                case 2:
                    System.out.println(a[1]);
                    break;
                case 3:
                    if (a[2] > a[1]) {
                        a[0] = a[0] - (a[3] - a[2]);
                        a[1] = a[2];
                    }   break;
                case 4:
                    
                default:
                    break;
            }
        }
    }
}
