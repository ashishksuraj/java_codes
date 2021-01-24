/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linchess;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class LINCHESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long[] a = new long[n];
            int min = 1000000000, b = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
                if (k % a[i] == 0) {
                    a[i] = k / a[i];
                    if (a[i] < min) {
                        min = (int) a[i];
                        b = i;
                    }
                } else {
                    a[i] = 0;
                }
            }
            //System.out.println(b);
            if (min == 1000000000) {
                System.out.println("-1");
            } else {
                System.out.println(k / a[b]);
            }
            //System.out.println(Arrays.toString(a));
            //System.out.println(min);
        }
    }

}
