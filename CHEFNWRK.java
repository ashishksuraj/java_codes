/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefnwrk;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ashish
 */
public class CHEFNWRK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int i = 0, b = 0,y=0;
            int sum = 0;
            if (a[i]>k) {
                System.out.println("-1");
                y++;
            }
            while (k > sum && i != n - 1) {
                sum += a[i];
                i++;
                if (k > sum) {
                    sum -= k;
                    b++;
                }
            }
            if (y==0) {
                System.out.println(b);
            }
        }
    }

}
