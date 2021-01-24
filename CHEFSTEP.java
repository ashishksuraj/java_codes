/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefstep;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHEFSTEP {

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
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
            }
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (a[i] % k == 0) {
                    s.append(1);
                } else {
                    s.append(0);
                }
            }
            System.out.print(s);
        }
    }
}
