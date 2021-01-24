/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corus;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CORUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            String str = scan.next();
            int c = scan.nextInt();
            int[] sort = new int[str.length()];
            for (int i = 0; i < n; i++) {
                sort[i] = str.charAt(i);
            }
            Arrays.sort(sort);
            System.out.println(Arrays.toString(sort));
            for (int i = 0; i < c; i++) {
                for (int j = n - 1; j > 0; j--) {
                    if (sort[j - 1] < sort[j]) {
                        sort[j] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(sort));
        }
    }

}
