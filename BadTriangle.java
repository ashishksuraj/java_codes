/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bad.triangle;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class BadTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
            }
            if (a[0] + a[1] <= a[n - 1]) {
                System.out.println("1 " + "2 " + n);
            } else {
                System.out.println("-1");
            }
        }
    }

}
