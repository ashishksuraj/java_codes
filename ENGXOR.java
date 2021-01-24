/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engxor;

import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class ENGXOR {

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // Returns XOR of x and y 
    static int myXOR(int x, int y) {
        return (x | y)
                & (~x | ~y);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long start = System.currentTimeMillis();
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int k = 0, l = 0, m = 0;
            int[] a = new int[n];
            int[] p = new int[q];
            int[][] fi = new int[n][2 * q];
            int[][] evenodd = new int[q][2];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < q; i++) {
                p[i] = scan.nextInt();
            }
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < n; j++) {
                    fi[j][i] = myXOR(p[i], a[j]);
                }
            }
            for (int i = q; i < 2 * q; i++) {
                for (int j = 0; j < n; j++) {
                    fi[j][i] = countSetBits(fi[j][k]);
                    if (fi[j][i] % 2 == 0) {
                        evenodd[l][0]++;
                    } else {
                        evenodd[l][1]++;
                    }
                }
                l++;
                k++;
            }
            /* k = 0;
            for (int i = q; i < 2 * q; i++) {
                for (int j = 0; j < n; j++) {
                    if (fi[j][i] % 2 == 0) {
                        evenodd[k][0]++;
                    } else {
                        evenodd[k][1]++;
                    }
                }
                k++;
            }
             */
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2 * q; j++) {
                    System.out.print(fi[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(evenodd[i][j] + " ");
                }
                System.out.println();
            }
            //System.out.println(Arrays.toString(fi));
        }
        long end = System.currentTimeMillis();
        long time = start - end;
        System.err.println(start);
        System.err.println(end);
        System.out.println(start);
        System.out.println(end);
        System.out.println("Exicution time is " + time);
    }

}
