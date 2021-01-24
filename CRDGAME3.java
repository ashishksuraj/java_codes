/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crdgame3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CRDGAME3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int c = scan.nextInt();
            int r = scan.nextInt();
            int[] a = new int[4];
            int x = 0, y = 0;
            a[0] = c / 9;
            if (c % 9 != 0) {
                a[1] = 1;
            } else {
                a[1] = 0;
            }
            a[2] = r / 9;
            if (r % 9 != 0) {
                a[3] = 1;
            } else {
                a[3] = 0;
            }
            x = a[0] + a[1];
            y = a[2] + a[3];
            System.out.println(Arrays.toString(a));
            if (x < y) {
                System.out.println("0 " + x);
            } else {
                System.out.println("1 " + y);
            }
        }
    }

}
