/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class TREE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] ar = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scan.nextLong();
            }
            Arrays.sort(ar);
            int h = 0;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] != ar[i + 1]) {
                    h++;
                }
            }
            if (ar[0] == 0) {
                System.out.println(h);
            } else {
                System.out.println(h + 1);
            }
        }

    }

}
