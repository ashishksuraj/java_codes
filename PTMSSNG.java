/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmssng;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class PTMSSNG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c = 0, d = 0;
            long[] a = new long[4 * n - 1];
            long[] b = new long[4 * n - 1];
            for (int i = 0; i < 4 * n - 1; i++) {
                a[i] = scan.nextLong();
                b[i] = scan.nextLong();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < 4 * n - 2; i = i + 2) {
                if (a[i] != a[i + 1]) {
                    c = (int) a[i];
                    break;
                }
            }
            for (int i = 0; i < 4 * n - 2; i = i + 2) {
                if (b[i] != b[i + 1]) {
                    d = (int) b[i];
                    break;
                }
            }
            System.out.println(c+" "+d);
        }
    }
}
