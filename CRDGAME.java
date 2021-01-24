/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crdgame;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CRDGAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int  k = 0, sum1 = 0, sum2 = 0;
            long p, sum;
            long[] a = new long[n * 2];
            int[] b = new int[n * 2];
            for (int i = 0; i < n * 2; i++) {
                a[i] = scan.nextLong();
                sum = 0;
                long m = a[i];
                //System.err.println("sh " + m);
                while (m > 0) {
                    p = m % 10;
                    sum = sum + p;
                    //System.err.println("se " + sum);
                    m = m / 10;
                }
                b[k] = (int) sum;
                //k++;
                /*  if (i % 2 == 0) {
                    sum1 += b[k];
                } else {
                    sum2 += b[k];
                }*/
                k++;
            }
            for (int i = 0; i < 2 * n; i = i + 2) {
                //System.err.println("i is " + i);
                if (b[i] > b[i + 1]) {
                    sum1 += 1;
                    //System.out.println(sum1 + " a " + sum2);
                }
                if (b[i] < b[i + 1]) {
                    sum2 += 1;
                    //System.out.println(sum1 + " b " + sum2);
                }
                if (b[i] == b[i + 1]) {
                    sum1++;
                    sum2++;
                    //System.out.println(sum1 + " c " + sum2);
                }
            }
            //System.out.println(Arrays.toString(b));
            //System.out.println(sum1 + " f " + sum2);
            if (sum1>sum2) {
                System.out.println("0 "+sum1);
            }
            if (sum1<sum2) {
                System.out.println("1 "+sum2);
            }
            if (sum1==sum2) {
                System.out.println("2 "+sum1);
            }
        }
    }

}
